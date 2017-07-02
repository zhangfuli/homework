package com.kms.servlet.dao;
//
//import com.mysql.jdbc.Driver
import com.kms.servlet.model.Person;
import org.junit.Test;

import java.sql.*;

/**
 * Created by zfl on 2017/7/1.
 */
public class PersonDao {
    public static final String DriverName = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC";//?serverTimezone=UTC

    public static final String username = "root";
    public static final String Password = "root";
    //0此操作只执行一次且仅一次，为JDBC框架安装驱动程序
    static{
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test()
    public void addEmp(Person person){

        String sql = "INSERT into servlet (name,pwd,sex,enjoy,date) \n" +
                " VALUES ( ? , ? , ? , ? , ? ) ";
        try {
            //1建立数据库连接
            Connection connect = DriverManager.getConnection(URL, username, Password);
            //2建立传输SQL语句的Statement
//            Statement statement = connect.createStatement();
            PreparedStatement statement= connect.prepareStatement(sql);
            statement.setString(1,person.getName());   //为第一个占位符赋值
            statement.setString(2,person.getPwd());    //setObject()
            statement.setString(3,person.getSex());
            statement.setString(4,person.getEnjoy());    //setObject()
            statement.setString(5,person.getDate());

            //3执行SQL,返回影响记录的行数
            int i = statement.executeUpdate();
            System.out.println(i);
            //4必须关闭链接
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
