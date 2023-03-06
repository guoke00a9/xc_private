package javase.advanced.反射机制;

import java.util.Date;

/**
 * 要操作一个类的字节码，首先获取到这个类的字节码，怎么获取java.lang.Class实例？
 * 		三种方式：
 * 			第一种:Class c = Class.forName("完整类名带包名");
 * 			第二种:Class c = 对象.getClass();
 * 			第三种:Class c = 任何类型.class;
 * 			
 * @author Passerby
 *
 */
public class 获取class字节码 {

	public static void main(String[] args) {

		/**
		 * Class.forName()
		 * 		1.静态方法
		 * 		2.方法的参数是一个字符串
		 * 		3.字符串需要的是一个完整类名。
		 * 		4.完整类名必须带有包名。（java.lang也不能省略 ）
		 */
		Class c1 = null;
		Class c2 = null;
		Class c3 = null;
		Class c4 = null;
		try {
			c1 = Class.forName("java.lang.String");
			c2 = Class.forName("java.util.Date");
			c3 = Class.forName("java.lang.Integer");
			c4 = Class.forName("java.lang.System");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String s = "abc";
		Class x = s.getClass();//x代表String.class字节码文件，x代表String类型。
		System.out.println(c1 == x);
		
		Date d = new Date();
		Class y = d.getClass();
		System.out.println(c2 == y);
		
		Class z = String.class;//z代表String类型
		Class k = int.class;//k代表int类型
		System.out.println(x == z);
	}

}
