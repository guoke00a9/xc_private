package javase.advanced.exception异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常对象的重要的方法：
 * 		获取异常简单的描述信息：
 * 			String msg = exception.getMessage();
 * 		打印异常追踪的堆栈信息:
 * 			exceotion.printStackTrace();
 * @author 王爸爸
 *
 */
public class practice_异常_方法 {

	public static void main(String[] args) {
		
		NullPointerException e = new NullPointerException("空指针异常");
		String msg =  e.getMessage();
		System.out.println(msg);
		
		e.printStackTrace();
		System.out.println("Hello World!!!");
		System.out.println("*****************************************************");
		//**********************************************************************/

		try {
			m1();
		} catch (FileNotFoundException e1) {
			/**
			 * 打印异常堆栈追踪信息：
			 * 		e1.printStackTrace();
			 * 			java.io.FileNotFoundException: D:\ecipse\work space\1.13\practice.txt (系统找不到指定的路径。)
						at java.base/java.io.FileInputStream.open0(Native Method)
						at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
						at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
						at java.base/java.io.FileInputStream.<init>(FileInputStream.java:108)
						at com.my.javaSE.异常.practice_异常_方法.m1(practice_异常_方法.java:43)
						at com.my.javaSE.异常.practice_异常_方法.main(practice_异常_方法.java:29)
			 * 在实际开发中建议使用这个，养成好习惯。
			 */
			e1.printStackTrace();
		}
		
	}

	private static void m1() throws FileNotFoundException {
		
		new FileInputStream("D:\\ecipse\\work space\\1.13\\practice.txt");
	}
}
