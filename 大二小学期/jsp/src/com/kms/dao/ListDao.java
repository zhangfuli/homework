package com.kms.dao;


import com.kms.model.Role;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zfl on 2017/7/2.
 */
public class ListDao extends BasicDao{

    public List<Role> lrs(){

        List<Role> lrs = new ArrayList<Role>();

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
                Role role = new Role();
                role.setDepno(resultSet.getInt("depno"));
                role.setDepname(resultSet.getString("depname"));
                role.setLoc(resultSet.getString("loc"));
                lrs.add(role);

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
    public void test(){

//        List<Role> lrs = new ArrayList<Role>();

        String sql = "SELECT *\n" +
                "FROM ch6_dep";

        try{
            Connection connection = getConnect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Role role = new Role();
                role.setDepno(resultSet.getInt("depno"));
                role.setDepname(resultSet.getString("depname"));
                role.setLoc(resultSet.getString("loc"));
                System.out.println(role.getDepno());
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
