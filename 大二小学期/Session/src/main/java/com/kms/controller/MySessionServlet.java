package com.kms.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by zfl on 2017/7/3.
 */
public class MySessionServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        System.out.println("123");
        System.out.println(session.isNew());//是否在当前请求中创建
        System.out.println(session.getId());
        System.out.println(session.getCreationTime());//获得创建时间
        System.out.println(session.getLastAccessedTime());
        System.out.println(session.getMaxInactiveInterval());
        session.setMaxInactiveInterval(10);
        session.invalidate();

        req.getRequestDispatcher("/El.jsp").forward(req, resp);
    }
}
