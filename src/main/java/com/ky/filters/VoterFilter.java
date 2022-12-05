package com.ky.filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "VoterFilter", urlPatterns = {"/voter-age"})
public class VoterFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse res= (HttpServletResponse) response;
        int age=Integer.parseInt(req.getParameter("age"));
        if(age>=18){
            chain.doFilter(request, response);
        }else {
            res.sendRedirect("voter");
        }

    }
}
