package javase.mysql.Query;


import javase.util.DBU;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 行级锁修改 extends Thread{
    public void run(){
        Connection cnct = null;
        PreparedStatement ps = null;
        try {
            cnct = DBU.getConnection();
            cnct.setAutoCommit(false);

            String sql = "update staff set name = ? where brand_id = ?";
            ps = cnct.prepareStatement(sql);

            ps.setString(1,"盖伦");
            ps.setString(2,"031004");
            int count = ps.executeUpdate();

            System.out.println(count == 1 ? "修改成功":"修改失败");
            cnct.commit();
        } catch (SQLException throwables) {
            if (cnct != null){
                try {
                    cnct.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        }finally {
            DBU.close(cnct,ps,null);
        }
    }
}
