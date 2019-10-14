package cn.com.serverlet_end.user;

import cn.com.serverlet_end.core.Request;
import cn.com.serverlet_end.core.Response;
import cn.com.serverlet_end.core.Serverlet;

public class RegisterServerlet implements Serverlet{
    @Override
    public void service(Request request,Response response) {
//        response.print("<html>");
//        response.print("<head>");
//        response.print("<title>");
//        response.print("第二个Serverlet小脚本");
//        response.print("</title>");
//        response.print("</head>");
//        response.print("<body>");
//        response.print("注册成功："+request.getParameter("uname"));
//        response.print("</body>");
//        response.print("</html>");
        response.print("注册成功！！！");
    }
}
