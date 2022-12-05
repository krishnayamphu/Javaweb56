package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "JSTLServlet", value = "/jstl")
public class JSTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> employees=new ArrayList<>();
        employees.add("Ram");
        employees.add("Hari");
        employees.add("Shyam");
        employees.add("Nabin");
        request.setAttribute("employees", employees);
        request.setAttribute("book","Java Programming");
        request.getRequestDispatcher("jstl.jsp").forward(request,response);
    }
}
