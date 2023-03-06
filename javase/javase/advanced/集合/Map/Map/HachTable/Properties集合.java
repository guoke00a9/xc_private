package javase.advanced.集合.Map.Map.HachTable;

import java.util.Properties;

/**
 * HashTable：
 * 		线程安全的
 * 		效率较低 使用较少 保证线程安全有别的方式
 * 		HashTabale初始化容量11，默认因子0.75
 * 		HashTable扩容：原容量*2+1
 */

/**
 * Properties：
 * 		目前只需要掌握Properties属性类对象的相关方法即可。
 * 		是一个Map集合，继承与HashTable。
 * 		Properties的key和value都是String类型的。
 * 		Properties是一个属性类对象。
 */
public class Properties集合 {

	public static void main(String[] args) {

		//创建一个Properties对象
		Properties pro = new Properties();
		
		//存
		pro.setProperty("user","root");
		pro.setProperty("password","123456");
		
		//取【通过key获取value】
		String user = pro.getProperty("user");
		String password = pro.getProperty("password");
		System.out.println(user);
		System.out.println(password);
	}

}
