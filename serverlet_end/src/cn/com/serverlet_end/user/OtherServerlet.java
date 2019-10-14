package cn.com.serverlet_end.user;

import cn.com.serverlet_end.core.Request;
import cn.com.serverlet_end.core.Response;
import cn.com.serverlet_end.core.Serverlet;

public class OtherServerlet implements Serverlet{
    @Override
    public void service(Request request, Response response) {
        response.print("其它测试页面");
    }
}
