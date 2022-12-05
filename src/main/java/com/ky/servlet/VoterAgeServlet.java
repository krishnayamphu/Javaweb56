package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "VoterAgeServlet", value = "/voter-age")
public class VoterAgeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int age=Integer.parseInt(request.getParameter("age"));
    response.getWriter().print("You are eligible to vote");
    response.getWriter().print("Age:"+age);
    }
}
