package javase.macase.数据库登陆模拟;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.sql.Statement;
/**
 * 当前程序存在一个问题：
 * 		用户名：fdsa
 * 		密码：fasa' or '1'='1
 * 		登陆成功
 * 		这种现象被称为sql注入【黑客经常使用】
 * 导致sql注入的根本原因是什么？
 * 		用户输入的信息中含有sql语句关键字，并且这些关键字参与sql语句的编译过程
 * 		导致sql语句的愿意被扭曲，进而达到sql注入
 *
 */
public class login {

	public static void main(String[] args) {

		//初始化一个界面
		Map<String,String> userLoginInfo = initUI();
		boolean loginResult = login(userLoginInfo);
		System.out.println(loginResult ? "登陆成功":"登录失败");
	}

	private static boolean login(Map<String, String> userLoginInfo) {
		//布尔标记
		boolean loginResult = false;
		//JDBC代码
		Connection cnct = null;
		Statement sttmt = null;
		ResultSet rstst = null;
		
		try {
			//1、注册驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2、获取连接
			cnct = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "1216");
			//3、获取数据库操作对象
			sttmt = cnct.createStatement();
			//4、执行sql
			String sql = "select * from t_user where loginName = '"+userLoginInfo.get("loginName")+"' and loginPswd = '"+userLoginInfo.get("loginPswd")+"'";
			//以上正好完成了sql语句的拼接，以下代码的含义是，发送sql给DBMS，DBMS进行sql编译
			//正好将用户提供的“非法信息编译进去”，导致原sql语句扭曲了
			rstst = sttmt.executeQuery(sql);
			//5、处理结果集
			if (rstst.next()) loginResult = true;
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			//6、释放资源
			if (rstst != null) {
				try {
					rstst.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (sttmt != null) {
				try {
					sttmt.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (cnct != null) {
				try {
					cnct.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		return loginResult;
	}

	/**
	 * 初始化用户界面
	 * @return 用户输入的用户名和密码等信息
	 */
	private static Map<String, String> initUI() {
		Scanner s = new Scanner(System.in);
		System.out.println("用户名：");
		String loginUser = s.nextLine();
		System.out.println("密码：");
		String loginPswd = s.nextLine();
		Map<String, String> userLoginInio = new HashMap<>();
		userLoginInio.put("loginName", loginUser);
		userLoginInio.put("loginPswd", loginPswd);
		return userLoginInio;
	}

}
