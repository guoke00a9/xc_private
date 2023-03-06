package javase.mysql.事务;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 重点三行代码
 *      Connection.setAutoCommit（false）；
 *      Connection.commit（）；
 *      Connection.rollback（）；
 */
public class 手动提交事务 {
    public static void main(String[] args) {

        ResourceBundle rstst = ResourceBundle.getBundle("jdbc");
        String driver = rstst.getString("driver");
        String url = rstst.getString("url");
        String user = rstst.getString("user");
        String password = rstst.getString("password");

        Connection cnct = null;
        PreparedStatement ps = null;
        ResultSet rsst = null;

        Scanner s = new Scanner(System.in);
        System.out.println("请输入本人账号、转账金额和转账账号：");
        String temstr = s.nextLine();
        String[] strarr = temstr.split(" ");
        int Aact = Integer.parseInt(strarr[0]);
        double balance = Double.parseDouble(strarr[1]);
        int Bact = Integer.parseInt(strarr[2]);

        try {
            //1、注册驱动
            Class.forName(driver);
            //2、获取连接
            cnct = DriverManager.getConnection(url);
            //3、获取预编译数据库操作对象
            cnct.setAutoCommit(false);
            String sql = "update m_accout set balance = ? where act = ?";
            ps = cnct.prepareStatement(sql);
            //4、执行sql
            ps.setDouble(1,balance);
            ps.setInt(2,Aact);
            int count = ps.executeUpdate();

//            String str = null;
//            str.toString();

            ps.setDouble(1,balance);
            ps.setInt(2,Bact);
            count += ps.executeUpdate();

            cnct.commit();
            System.out.println(count);
        } catch (Exception e) {
            if (cnct != null){
                try {
                    cnct.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (rsst != null){
                try {
                    rsst.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (cnct != null){
                try {
                    cnct.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
