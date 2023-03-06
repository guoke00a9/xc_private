package javase.mysql.增删改查;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.sql.Statement;

public class 资源绑定器 {

	public static void main(String[] args) {

		//创建资源绑定器
		ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");
		
		Connection cont = null;
		Statement sttmt = null;
		try {
			//1、注册驱动
			Class.forName(driver);
			//2、获取连接
			cont = DriverManager.getConnection(url,user,password);
			//3、获取数据库操作对象
			sttmt = cont.createStatement();
			//4、执行sql语句
			String sql = "alter table basic add phone varchar(16)";
			sttmt.execute(sql);
			
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//6、释放资源【遵循从小到大依次关闭】
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
