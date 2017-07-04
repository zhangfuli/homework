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
 * Created by zfl on 2017/7/4.
 */
public class LoginIndexServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Person person = new Person("zfl","zfl");
        String name = req.getParameter("pnm");
        String pwd = req.getParameter("pwd");
        if(person.getPnm().equals(name) && person.getPwd().equals( pwd)){
            HttpSession session = req.getSession();
            session.setAttribute("person",person);
            session.setMaxInactiveInterval(10);
            //响应重定向
            resp.sendRedirect("/index.jsp");
        }else{
            System.out.println("error");
            PrintWriter out = resp.getWriter();
            String js = "<script>" +
                    "alert('错误');" +
                    "window.history.go(-1)" +
                    "</script>";
        }

    }
}
