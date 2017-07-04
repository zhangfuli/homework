package com.kms.controller;

import com.kms.model.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zfl on 2017/7/3.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String name = req.getParameter("pnm");
        String pwd = req.getParameter("pwd");
        String sid = req.getParameter("sid");

        HttpSession session = req.getSession();
        System.out.println(session.getAttribute("sid"));
        if(session.getAttribute("sid").equals(sid)){
            Person person = new Person(name,pwd);
            session.setAttribute("person",person);
            session.setMaxInactiveInterval(10);
            resp.sendRedirect("/index.jsp");
        }else{
            System.out.println("error");
            PrintWriter out = resp.getWriter();
            out.write("<script>alert('error');</script>");
            resp.sendRedirect("/index.jsp");
        }



    }
}
