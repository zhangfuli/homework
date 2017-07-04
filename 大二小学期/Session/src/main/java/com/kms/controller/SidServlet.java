package com.kms.controller;

import com.sun.net.httpserver.HttpServer;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

/**
 * Created by zfl on 2017/7/4.
 */
public class SidServlet extends HttpServlet {

    private  final static char[] cs = new char[]{'张','富','利','薛','双','儒'};
    private final static Random random = new Random(new Date().getTime());
    private String sid(){
        String string = "";
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < 4;i++){
            sb.append(cs[random.nextInt(cs.length)]);
        }
        string = sb.toString();
        return string;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //产生随机验证码
        String sid = sid();

        //在Session中保存验证码
        HttpSession session = req.getSession();
        session.setAttribute("sid",sid);

        //生成验证码图片
        BufferedImage bi = new BufferedImage(68,22,BufferedImage.TYPE_INT_RGB);
        Graphics g= bi.getGraphics();
        g.drawString(sid,0,20);


        //写入IO流
        ImageIO.write(bi,"JPG",resp.getOutputStream());

    }
}
