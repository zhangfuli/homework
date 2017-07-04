package com.kms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by zfl on 2017/7/3.
 */
public class BasicDao {
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
    public Connection getConnect(){
        try {
            Connection connect = DriverManager.getConnection(URL, username, Password);
            return  connect;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
