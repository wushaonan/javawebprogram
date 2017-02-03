package com.wrox.chapter05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nan on 17-2-3.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private static final Map<String,String> userDatabase = new HashMap<>();

    static {
        userDatabase.put("wushaonan","wushaonan");
        userDatabase.put("xiaxudong","xiaxudong");
        userDatabase.put("zhangyaoqi","zhangyaoqi");
        userDatabase.put("zhoujielun","zhoujielun");

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("username") != null){
            response.sendRedirect("tickets");
            return;
        }
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == null || password == null
                || !userDatabase.containsKey(username)
                || !password.equals(userDatabase.get(username))){
            request.setAttribute("loginFailed",true);
            request.getRequestDispatcher("WEB-INF/jsp/view/login.jsp").forward(request,response);
        }else {
            session.setAttribute("username",username);
            request.changeSessionId();
            response.sendRedirect("tickets");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (request.getParameter("logout") != null){
            session.invalidate();
            response.sendRedirect("login");
            return;
        }else if (session.getAttribute("username") != null){
            response.sendRedirect("tickets");
            return;
        }
        request.setAttribute("loginFailed",false);
        request.getRequestDispatcher("WEB-INF/jsp/view/login.jsp").forward(request,response);
    }
}
