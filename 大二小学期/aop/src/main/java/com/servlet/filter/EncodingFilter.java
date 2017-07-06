package com.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zfl on 2017/7/5.
 */
public class EncodingFilter  implements Filter{
    private String Encoding = "UTF-8";
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding(Encoding);
        servletResponse.setCharacterEncoding(Encoding);
        filterChain.doFilter(servletRequest,servletResponse);

    }

    public void destroy() {

    }
}
