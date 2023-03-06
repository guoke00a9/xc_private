package javase.mysql.Query;


import javase.util.DBU;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 查询
 */
public class 演示行级锁 {
    public static void main(String[] args) throws InterruptedException {

        Connection cnnt = null;
        PreparedStatement ps = null;
        ResultSet rstst = null;
        try {
            cnnt = DBU.getConnection();
            cnnt.setAutoCommit(false);//开启事务
            String sql = "select brand_id,name,telephone,address from staff where address like ? for update";
            ps = cnnt.prepareStatement(sql);

            ps.setString(1,"%亚");
            rstst = ps.executeQuery();
            while (rstst.next()){
                System.out.println(rstst.getString("brand_id")+"\t"
                        +rstst.getString("name")+"\t"
                        +rstst.getString("telephone")+"\t"
                        +rstst.getString("address"));
            }
            行级锁修改 updt = new 行级锁修改();
            updt.start();
            Thread.sleep(10000);
            cnnt.commit();//提交事务【事务结束】
        } catch (SQLException throwables) {
            if (cnnt != null){
                try {
                    cnnt.rollback();//回滚事务
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        }finally {
            DBU.close(cnnt,ps,rstst);
        }
    }
}
