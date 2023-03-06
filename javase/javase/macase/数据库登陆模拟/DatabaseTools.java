package javase.macase.数据库登陆模拟;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DatabaseTools {
	public Connection conn=null;
	public Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");					//定义MySQL的数据库驱动程序
			ResourceBundle bundle = ResourceBundle.getBundle("myjdbc");
			String driver = bundle.getString("driver");
			String url = bundle.getString("url");					//MySQL的数据库连接地址
			String user = bundle.getString("user");					//MySQL数据库的连接用户名
			String password = bundle.getString("password");			//MySQL数据库的连接密码
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
