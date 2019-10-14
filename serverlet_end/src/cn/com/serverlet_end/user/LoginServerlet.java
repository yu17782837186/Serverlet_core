package cn.com.serverlet_end.user;

import cn.com.serverlet_end.core.Request;
import cn.com.serverlet_end.core.Response;
import cn.com.serverlet_end.core.Serverlet;

public class LoginServerlet implements Serverlet {
    @Override
    public void service(Request request, Response response) {
        response.print("<html>");
        response.print("<head>");
        response.print("<meta charset=\"UTF-8\">");
        response.print("<title>");
        response.print("第一个Serverlet小脚本");
        response.print("</title>");
        response.print("</head>");
        response.print("<body>");
        response.print("欢迎回来："+request.getParameter("uname"));
        response.print("</body>");
        response.print("</html>");
    }
}
