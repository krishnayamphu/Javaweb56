package com.ky.controllers;

import com.ky.dao.UserDAO;
import com.ky.jdbc.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "UsersController", value = "/users")
public class UsersController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<User> users= UserDAO.getUsers();
        request.setAttribute("users",users);
        request.getRequestDispatcher("users/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        UserDAO.deleteUser(id);
        response.sendRedirect("users");
    }
}
