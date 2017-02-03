package com.wrox.chapter03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by SnWu on 2016/12/28.
 */
@WebServlet(
        name = "helloServlet",
        urlPatterns = {"/greeting", "/salutation", "/wazzup"},
        loadOnStartup = 1
)public class HelloServlet extends HttpServlet {
    private static final String DEFAULT_USER = "Guest";
    @Override
    public void destroy() {

        System.out.println("结束啦啦啦啦啦");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("开始啦啦啦啦啦");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        if(user == null)
            user = DEFAULT_USER;

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("    <head>\r\n")
                .append("        <title>Hello User Application</title>\r\n")
                .append("    </head>\r\n")
                .append("    <body>\r\n")
                .append("        Hello, ").append(user).append("!<br/><br/>\r\n")
                .append("        <form action=\"greeting\" method=\"POST\">\r\n")
                .append("            Enter your name:<br/>\r\n")
                .append("            <input type=\"text\" name=\"user\"/><br/>\r\n")
                .append("            <input type=\"submit\" value=\"Submit\"/>\r\n")
                .append("        </form>\r\n")
                .append("    </body>\r\n")
                .append("</html>\r\n");
    }
}
