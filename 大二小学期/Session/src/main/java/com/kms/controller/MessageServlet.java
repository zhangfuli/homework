package com.kms.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zfl on 2017/7/4.
 */
public class MessageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String msg = req.getParameter("msg");


        //获得ServletContext
        ServletContext app = getServletContext();

        //处理消息
        //获得消息的容器

        Object object = app.getAttribute("lms");
        List<String> lms = null;
        if(object == null){
            lms = new ArrayList<String>();
            app.setAttribute("lms",lms);
        }else {
            lms = (List<String>) object;
        }

        lms.add(0,msg);  //插入消息

        resp.getWriter().write("<script>window.history.go(-1);</script>");
    }
}
