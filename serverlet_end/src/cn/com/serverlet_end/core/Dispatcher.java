package cn.com.serverlet_end.core;

import java.io.IOException;
import java.net.Socket;

//分发器 :加入状态内容处理 404 505 以及首页
public class Dispatcher implements Runnable{
    private Socket client;
    private Request request;
    private Response response;
    public Dispatcher(Socket client) {
        this.client = client;
        try {
            //获取请求协议
            //获取响应协议
            request = new Request(client);
            response = new Response(client);
        } catch (IOException e) {
            e.printStackTrace();
            this.release();
        }
    }

    @Override
    public void run() {
        if (request.getUrl().equals("") || request.getUrl() == null) {

        }
        try {
            Serverlet serverlet = WebApp.getServerletFromUrl(request.getUrl());
            if (serverlet != null) {
                serverlet.service(request, response);
                //关注了状态码
                response.pushToBrowser(200);
            } else {
                //错误。。。
                response.pushToBrowser(404);
            }
        }catch(Exception e) {
            try {
                response.println("server is erroring");
                response.pushToBrowser(505);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        release();
    }
    //释放资源
    private void release() {
        try {
            client.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
