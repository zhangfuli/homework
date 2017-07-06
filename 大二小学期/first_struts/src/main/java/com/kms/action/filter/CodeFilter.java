package com.kms.action.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zfl on 2017/7/6.
 */
public class CodeFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        httpServletRequest.setCharacterEncoding("UTF-8");
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletResponse.setCharacterEncoding("UTF-8");

        filterChain.doFilter(servletRequest,  servletResponse);
    }

    public void destroy() {

    }
}
