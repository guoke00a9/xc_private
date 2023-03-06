package javase.mysql.增删改查;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class inser {

	public static void main(String[] args) {

		Connection connection = null;
		Statement stmt = null;
		try {
			//1、注册驱动
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			/**
			 * 2、数据库连接
			 * 		url:统一资源定位符【网络中某个资源的绝对路径】
			 * 		url包括那几部分？
			 * 			http://182.61.200.7:80/index.html
			 * 			协议：http://【通信协议】
			 * 				通信协议是通信之前就提前订好的数据传送格式
			 * 				数据包具体怎么传数据，格式提前就订好的。
			 * 			ip：182.61.200.7【服务器ip地址】
			 * 			port：80【服务器软件端口】
			 * 			资源名：index.html【服务器某个资源名】
			 * 		jdbc:mysql://127.0.0.1:3306/mydatabase
			 * 			jdbc:mysql://	协议
			 * 			127.0.0.1		ip地址
			 * 			3306			mysql数据库端口号
			 * 			mydatabase		数据库名字
			 * 		localhost和127.0.0.1都是本机ip
			 * 
			 */
			String url = "jdbc:mysql://127.0.0.1:3306/mydatabase";
			String user = "root";
			String password = "1216";
			connection = DriverManager.getConnection(url,user,password);
//			System.out.println("数据库连接对象"+connection);
			//3、获取数据库操作对象（statement专门执行sql语句的）
			stmt = connection.createStatement();
			//4、执行sql语句
			String sql = "INSERT INTO `mydatabase`.`name` (`id`, `name`) VALUES (2, '王杰')";
			/**
			 * 专门执行DML语句的（insert delete update）
			 * 返回值是“影响数据中的记录条数”
			 */
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "插入成功":"插入失败");
			//5、处理查询结果集
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//6、释放资源【遵循从小到大依次关闭】
				try {
					if (stmt != null) {
					stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if (connection != null) {
					connection.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
