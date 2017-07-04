package com.kms.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zfl on 2017/7/4.
 */
public class ReadMessageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext app = getServletContext();
        List<String> lms = null;
        lms = app.getAttribute("lms") == null? null: (List<String>) app.getAttribute("lms");

        PrintWriter writer = resp.getWriter();


        for(Iterator iterator = lms.iterator(); iterator.hasNext();){
           String string = (String) iterator.next();
           writer.println(string);
        }
    }
}
