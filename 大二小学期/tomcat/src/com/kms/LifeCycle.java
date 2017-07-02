package com.kms;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zfl on 2017/6/30.
 */
public class LifeCycle extends HttpServlet{

    String timer = "";
    int time;
    public LifeCycle(){
        System.out.println("-------1-----");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("---------2----");
        this.timer = getInitParameter("abc");
        this.time = Integer.parseInt(this.timer);
        System.out.println(Integer.parseInt(timer));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-------3-----");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("content-type","text/html;charset=UTF-8");

        time+= 1;
        String str = "你是第 <h1>"+ time +"</h1> 位访问者";
        PrintWriter out = resp.getWriter();
        out.write(str);
    }

    @Override
    public void destroy() {
        System.out.println("-------4-------");
    }
}
