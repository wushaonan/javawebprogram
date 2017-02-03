package com.wrox.chapter05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Vector;

/**
 * Created by nan on 17-2-3.
 */
@WebServlet(name = "ActivityServlet",urlPatterns = "/do/*")
public class ActivityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.recordSessionActivity(request);
        this.viewSessionActivity(request,response);
    }
    private void recordSessionActivity(HttpServletRequest request){
        HttpSession session = request.getSession();

        if (session.getAttribute("activity") == null)
            session.setAttribute("activity",new Vector<PageVisit>());
        Vector<PageVisit> visits = (Vector<PageVisit>)session.getAttribute("activity");

        if (!visits.isEmpty()){
            PageVisit last = visits.lastElement();
            last.setLeftTimestamp(System.currentTimeMillis());
        }
        PageVisit now = new PageVisit();
        now.setEnteredTimestamp(System.currentTimeMillis());
        if (request.getQueryString() == null)
            now.setRequest(request.getRequestURL().toString());
        else
            now.setRequest(request.getRequestURL()+"?"+request.getQueryString());


        try {
            now.setIpAddress(InetAddress.getByName(request.getRemoteAddr()));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        visits.add(now);
    }
    private void viewSessionActivity(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        request.getRequestDispatcher("/WEB-INF/jsp/view/viewSessionActivity.jsp").forward(request,response);
    }
}
