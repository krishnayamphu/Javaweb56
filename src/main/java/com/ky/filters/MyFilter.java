package com.ky.filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "MyFilter", urlPatterns = {"/demo"})
public class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("myfilter invoked before request");
        chain.doFilter(request, response);
        System.out.println("myfilter invoked after request");
    }
}
