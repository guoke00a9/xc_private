package javase.mysql.Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class wages {

	public static void main(String[] args) {

		//创建资源绑定器
				ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
				String driver = bundle.getString("driver");
				String url = bundle.getString("myurl");
				String user = bundle.getString("user");
				String password = bundle.getString("password");
				
				Connection cont = null;
				Statement sttmt = null;
				ResultSet rstst = null;
				try {
					//1、注册驱动
					Class.forName(driver);
					//2、获取连接
					cont = DriverManager.getConnection(url,user,password);
					//3、获取数据库操作对象
					sttmt = cont.createStatement();
					//4、执行sql语句
		            String sql = "select brand_id,month_pay,dormitory_subsidy,meals_subsidy,water_electric " +
							"from wages";
					rstst = sttmt.executeQuery(sql);
					while (rstst.next()) {
						/**
						 * 数据类型：
						 * 		不管数据库底层类型是什么
						 * 			getString返回的都是String类型
						 * 		通过调用getInt或getDouble方法
						 * 		可以对结果进行运算【底层需要时int或者double】
						 * 			int brand_id = rstst.getInt();
						 * 		
						 * 重点注意：
						 * 		取出数据方法：
						 * 			列名、查询结果集列名、下标【1开始】、指定类型
						 * 		列名称不是表中的列名称，是查询结果集的列名称
						 */
						String brand_id = rstst.getString("brand_id");
						String month_pay = rstst.getString("month_pay");
						String dormitory_subsidy = rstst.getString("dormitory_subsidy");
						String meal_subsidy = rstst.getString("meals_subsidy");
						String water_electric = rstst.getString("water_electric");
						System.out.println(brand_id+"\t"+month_pay+"\t"+dormitory_subsidy+"\t"+meal_subsidy+"\t"+water_electric);
					}
				} catch (ClassNotFoundException e) { 
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					//6、释放资源【遵循从小到大依次关闭】
					
					try {
						if (rstst != null) {
							rstst.close();
						}
					} catch (SQLException e) {
							e.printStackTrace();
					}
					try {
						if (sttmt != null) {
							sttmt.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if (cont != null) {
							cont.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
	}

}
