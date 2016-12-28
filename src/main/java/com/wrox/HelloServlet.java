package com.wrox;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by SnWu on 2016/12/28.
 */
@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    public void destroy() {
        System.out.println("结束啦啦啦啦啦");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("开始啦啦啦啦啦");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.getWriter().print("HelloWorld!!!");
    }
}
