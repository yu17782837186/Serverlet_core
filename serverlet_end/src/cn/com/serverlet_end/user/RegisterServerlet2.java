package cn.com.serverlet_end.user;

import cn.com.serverlet_end.core.Request;
import cn.com.serverlet_end.core.Response;
import cn.com.serverlet_end.core.Serverlet;

public class RegisterServerlet2 implements Serverlet {
    @Override
    public void service(Request request, Response response) {
        //关注业务逻辑
        String uname=request.getParameter("uname");
        String[] favs=request.getParameterValues("fav");
        response.print("<html>");
        response.print("<head>");
        response.print("<meta charset=\"UTF-8\">");
        response.print("<title>");
        response.print("注册成功");
        response.print("</title>");
        response.print("</head>");
        response.print("<body>");
        response.println("你注册的信息为:"+uname);
        response.println("你喜欢的类型为：");
        for (String v:favs) {
            if (v.equals("0")) {
                response.print("可爱型");
            }else if (v.equals("1")) {
                response.print("萝莉型");
            }else if (v.equals("2")){
                response.print("性感型");
            }
        }
        response.print("</body>");
        response.print("</html>");

    }
}
