package javase.mysql.增删改查;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {

	public static void main(String[] args) {
		Connection connet = null;
		Statement statmt = null;
		try {
			//1.注册驱动
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2、获取连接
			connet = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase","root","1216");
			System.out.println(connet);
			//3、获取数据库操作对象
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
