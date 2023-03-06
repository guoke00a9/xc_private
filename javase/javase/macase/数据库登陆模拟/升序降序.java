package javase.macase.数据库登陆模拟;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

public class 升序降序 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String group = s.nextLine();
		queryGroup(group);
	}

	private static void queryGroup(String group) {
		DatabaseTools dt = new DatabaseTools();
		Connection cnct = dt.getConn();
		Statement sttmt =null;
		ResultSet rsts =null;
		try {
			sttmt = cnct.createStatement();
			//4、执行sql语句
			String sql = "select month_pay from wages group by month_pay "+group;
			rsts = sttmt.executeQuery(sql);
			//5、处理结果集
			while (rsts.next()) {
				System.out.println(rsts.getString("month_pay"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rsts != null) {
				try {
					rsts.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (sttmt!= null) {
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
	}
}
