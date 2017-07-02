package com.kms.servlet;

import com.kms.dao.ListDao;
import com.kms.model.Role;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zfl on 2017/7/2.
 */
public class ListServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        ListDao listDao = new ListDao();
        List<Role> lrs = listDao.lrs();

//        //向request对象上附着数据
        req.setAttribute("lrs", lrs);

        //站内转发
        //定义转发器   并转发
        //    /---web
        req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }
}
