package com.servlet.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zfl on 2017/7/4.
 */
public class MyFilter implements Filter {
    public void destroy() {
        System.out.println("public void destiry()");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("A");

        System.out.println("C");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("public void init(FilterConfig filterConfig)");
    }
}
