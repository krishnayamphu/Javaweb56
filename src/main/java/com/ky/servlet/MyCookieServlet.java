package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyCookieServlet", value = "/MyCookieServlet")
public class MyCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie=new Cookie("app","Aptech");
        cookie.setMaxAge(60*60);
        response.addCookie(cookie);
        response.getWriter().print("cookie set successfully.");
    }
}
