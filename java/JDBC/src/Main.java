import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        try{
            con = DriverManager.getConnection("jdbc:odbc:test","","");
            sql = con.createStatement();
            rs = sql.executeQuery("SELECT*FROM goods WHERE price>300000");
            while(rs.next()){
                String number = rs.getString(1);
                String name = rs.getString(2);
                Date date = rs.getDate("madeTime");
                double price = rs.getDouble("price");
                System.out.println(number);
                System.out.println(name);
                System.out.println(date.toString());
                System.out.println(price);

            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
