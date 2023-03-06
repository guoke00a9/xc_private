package javase.mysql.Query;

import javase.util.DBU;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 模糊查询 {
    public static void main(String[] args) {
        Connection cnct = null;
        PreparedStatement ps = null;
        ResultSet rsst = null;
        try {
            /**
             * 注册数据库
             * 获取连接
             * 获取数据库操作对象
             * 执行sql语句
             * 遍历结果集
             * 关闭资源
             */
            cnct = DBU.getConnection();
            String sql = "select address from staff where address like ?";
            ps = cnct.prepareStatement(sql);
            ps.setString(1,"___亚%");
            rsst = ps.executeQuery();
            while (rsst.next()){
                System.out.println(rsst.getString(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBU.close(cnct,ps,rsst);
        }
    }
}
