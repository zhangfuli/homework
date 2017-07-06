package com.mysql.dao;



import com.mysql.model.Dept;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zfl on 2017/7/3.
 */
public class ListDao extends BasicDao{

    public static List<Dept> lrs(){

        List<Dept> lrs = new ArrayList<Dept>();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "SELECT *\n" +
                "FROM ch6_dep";

        try{
            connection = getConnect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Dept dept = new Dept();
                dept.setDepno(resultSet.getInt("depno"));
                dept.setDepname(resultSet.getString("depname"));
                dept.setLoc(resultSet.getString("loc"));
                lrs.add(dept);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return lrs;
    }

    @Test()
    public void Test(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "SELECT *\n" +
                "FROM ch6_dep";

        try{
            connection = getConnect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
//                Dept role = new Dept();
//                role.setDepno(resultSet.getInt("depno"));
//                role.setDepname(resultSet.getString("depname"));
//                role.setLoc(resultSet.getString("loc"));
                System.out.println(resultSet.getInt("depno"));
                System.out.println(resultSet.getString("depname"));
                System.out.println(resultSet.getString("loc"));

            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}

