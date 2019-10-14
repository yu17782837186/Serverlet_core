package cn.com.serverlet_end.core;
//服务器小脚本接口
public interface Serverlet {
    void service(Request request, Response response);
}
