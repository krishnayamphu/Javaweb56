package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "WelcomeServlet", value = "/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("login");
        } else {
            if (session.getAttribute("user") == null) {
                response.sendRedirect("login");
            }else {
                request.getRequestDispatcher("welcome.jsp").forward(request, response);
            }
        }

    }
}
