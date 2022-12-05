package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieGetServlet", value = "/cookieget")
public class CookieGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies=request.getCookies();
        PrintWriter pw=response.getWriter();
        for(Cookie ck:cookies){
            pw.print(ck.getName()+" => "+ck.getValue());
        }
    }
}
