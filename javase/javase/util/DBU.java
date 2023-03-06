package javase.util;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * url 获取数据库key
 */
public class DBU {

    static ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
    static String myurl = bundle.getString("myurl");
    static String user = bundle.getString("user");
    static String password = bundle.getString("password");
    private DBU(){}

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(myurl,user,password);
    }

    public static void close (Connection cnnt, Statement sttmt, ResultSet rsst){
        if (rsst != null){
            try {
                rsst.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (sttmt != null){
            try {
                sttmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (cnnt != null){
            try {
                cnnt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
