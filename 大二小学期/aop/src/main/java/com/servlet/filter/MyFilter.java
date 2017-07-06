package com.servlet.filter;


import sun.font.TrueTypeFont;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

        //改变请求既定路线
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();

        Object object = session.getAttribute("person");
        if(object==null){
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            httpServletResponse.sendRedirect("");//绝对路径
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("public void init(FilterConfig filterConfig)");
    }
}
