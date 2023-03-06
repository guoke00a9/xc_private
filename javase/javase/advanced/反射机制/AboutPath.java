package javase.advanced.反射机制;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AboutPath {

	public static void main(String[] args) {

		/**
		 * 这种方式的路径缺点是:移植性差，只能在eclipse中默认的当前路径是my_project的根
		 * 		reader = new FileReader("userinfo.properties");
		 */

		/**
		 * 使用以下通用方式的前提是：这个文件必须放在类路径下
		 * 在src下的都是类路径
		 * src是类的根路径
		 */
		
		/**
		 * Thread.currentThread()当前线程对象
		 * getContextClassLoader()线程对象的方法，可以获取当前线程类加载器对象
		 * getResource("")类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
		 */
		String path = Thread.currentThread().getContextClassLoader()
				.getResource("userinfo.properties").getPath();
		System.out.println(path);
		
		//这种直接以io流的方式返回
		InputStream read = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("userinfo.properties");
		Properties properties = new Properties();
		try {
			properties.load(read);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		if (read != null) {
			try {
				read.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println(properties.getProperty("user"));
	}

}
