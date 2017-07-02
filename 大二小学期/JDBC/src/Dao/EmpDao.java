package Dao;

import org.junit.Test;

import java.sql.*;


/**
 * Created by zfl on 2017/6/29.
 */
public class EmpDao {
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
    @Test
    public void addEmp(){

      String sql = "insert into emp values(\'202\',\'66\',\'66\')";
        try {
            //1建立数据库连接
            Connection connect = DriverManager.getConnection(URL, username, Password);
            //2建立传输SQL语句的Statement
           Statement statement = connect.createStatement();

            //3执行SQL,返回影响记录的行数
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            //4必须关闭链接
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void zhanweifu(){
        String sql = "insert into emp values(?,?,?)";//使用？代替sql中的数据，相当于方法的形参 占位符
        try {
            //1建立数据库连接
            Connection connect = DriverManager.getConnection(URL, username, Password);
            //2建立传输SQL语句的Statement
            //建立传输有占位符的sql语句的statement
            PreparedStatement statement= connect.prepareStatement(sql);
            statement.setInt(1,25);   //为第一个占位符赋值
            statement.setString(2,"2323");    //setObject()
            statement.setString(3,"4545");
        //    3执行SQL,返回影响记录的行数
            int i = statement.executeUpdate();
            System.out.println(i);
            //4必须关闭链接
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void select(){
         String sql = "select d.deptno\n" +
        "        from dept d "+
                 "where ? < 10";
        try {
            //1建立数据库连接
            Connection connect = DriverManager.getConnection(URL, username, Password);
            //2建立传输SQL语句的Statement
            //建立传输有占位符的sql语句的statement
            PreparedStatement statement= connect.prepareStatement(sql);

            statement.setString(1,"id");   //为第一个占位符赋值
            //3执行SQL,返回影响记录的行数
            //查询
            ResultSet rSet = statement.executeQuery();//单次、单步、单向、在线式读取结果集的对象
            //只是搬运数据的工具，connection不能关闭

            while(rSet.next()){
                //rSet.getObject(2); //第几列或者是列名
                System.out.println(rSet.getObject("d.deptno"));
            }
            //4必须关闭链接
            connect.close();
            rSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void update(){
        String sql = "update home1\n" +
                "set id = id * ? " ;
        try {
            //1建立数据库连接
            Connection connect = DriverManager.getConnection(URL, username, Password);
            //2建立传输SQL语句的Statement
            //建立传输有占位符的sql语句的statement
            PreparedStatement statement= connect.prepareStatement(sql);
            statement.setInt(1,10);    //setObject()

            //3执行SQL,返回影响记录的行数
            int i = statement.executeUpdate();
            System.out.println(i);
            //4必须关闭链接
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void delete(){
        String sql = "delete\n" +
                "from emp\n" +
                "where empno = ? ";
        try {
            //1建立数据库连接
            Connection connect = DriverManager.getConnection(URL, username, Password);
            //2建立传输SQL语句的Statement
            //建立传输有占位符的sql语句的statement
            PreparedStatement statement= connect.prepareStatement(sql);
            statement.setInt(1,10);   //为第一个占位符赋值
            //3执行SQL,返回影响记录的行数
            int i = statement.executeUpdate();
            System.out.println(i);
            //4必须关闭链接
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test()
    public void Test(){

        String sql = "INSERT into servlet (name,pwd,sex,enjoy,date) \n" +
                " VALUES ( ? , ? , ? , ? , ? ) ";
        try {
            //1建立数据库连接
            Connection connect = DriverManager.getConnection(URL, username, Password);
            //2建立传输SQL语句的Statement
//            Statement statement = connect.createStatement();
            PreparedStatement statement= connect.prepareStatement(sql);
//            statement.setObject(1,person.getName());   //为第一个占位符赋值
//            statement.setString(2,person.getPwd());    //setObject()
//            statement.setString(3,person.getSex());
//            statement.setString(4,person.getEnjoy());    //setObject()
//            statement.setObject(5,person.getDate());
            statement.setString(1,"zfl");   //为第一个占位符赋值
            statement.setString(2,"zfl");    //setObject()
            statement.setString(3,"zfl");
            statement.setString(4,"zfl");    //setObject()
            statement.setInt(5,000000);

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
//    public void select(){
//        String sql = "select d.deptno\n" +
//                "        from dept d";
//        try {
//            //1建立数据库连接
//            Connection connect = DriverManager.getConnection(URL, username, Password);
//            //2建立传输SQL语句的Statement
//            Statement statement = connect.createStatement();
//            //建立传输有占位符的sql语句的statement
////            PreparedStatement statement= connect.prepareStatement(sql);
////
////            statement.setInt(1,10);   //为第一个占位符赋值
////            statement.setString(2,"2323");    //setObject()
////            statement.setString(3,"4545");
//            //3执行SQL,返回影响记录的行数
//            // int i = statement.executeUpdate();
//            //System.out.println(i);
//
//            //查询
//
//            ResultSet rSet = statement.executeQuery();//单次、单步、单向、在线式读取结果集的对象
//            //只是搬运数据的工具，connection不能关闭
//
//            while(rSet.next()){
//                //rSet.getObject(2); //第几列或者是列名
//                System.out.println(rSet.getObject("d.deptno"));
//            }
//
//
//            //4必须关闭链接
//            connect.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

