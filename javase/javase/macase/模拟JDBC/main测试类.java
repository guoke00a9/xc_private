package javase.macase.模拟JDBC;

import java.util.ResourceBundle;

public class main测试类 {

	public static void main(String[] args) throws Exception{

		
		/**
		 * 文件专属流
		 * 		Properties pro = new Properties();
		 * 		pro.load(new FileReader("src\\priv\\xc\\my_project\\macase\\模拟JDBC\\JDBC.properties"));
				String ClassName = pro.getProperty("ClassName");
				System.out.println(ClassName);
				
				Class c = Class.forName(ClassName);
		 */
		//创建资源绑定器
		ResourceBundle bundle = ResourceBundle.getBundle("D:\\eclipse\\MyWorkSpace\\my_project\\userinfo");
		String ClassName = bundle.getString("ClassName");
		System.out.println(ClassName);
//			Class c = Class.forName(ClassName);
//			JDBC jdbc = (JDBC) c.newInstance();
//			jdbc.getLink();
	}
}
