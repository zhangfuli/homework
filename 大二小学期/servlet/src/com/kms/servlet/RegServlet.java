package com.kms.servlet;

import com.kms.servlet.dao.PersonDao;
import com.kms.servlet.model.Person;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zfl on 2017/7/1.
 */
public class RegServlet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //匹配编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("content-type","text/html;charset = UTF-8");

        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String sex = req.getParameter("sex");
        String enjoy= req.getParameter("enjoy");

        System.out.println(name);
        System.out.println(pwd);
        System.out.println(sex);
        System.out.println(enjoy);

        Person person = new Person(name, pwd, sex, enjoy);
        PersonDao personDao = new PersonDao();
        personDao.addEmp(person);
    }


    @Test()
    public void Test()  {
        Person person = new Person("czf", "czf", "czf" , "czf");
        PersonDao personDao = new PersonDao();
        personDao.addEmp(person);
    }
}
