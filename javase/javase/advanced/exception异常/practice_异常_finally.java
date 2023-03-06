package javase.advanced.exception异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * finally子句：
 * 		在finally子句中的代码是最后执行的，并且一定会执行，即使try语句块中的代码出现了异常。
 * 		finally语句必须和try一起出现，不能单独编写。
 * 		try不能单独使用
 * 		try和finally可以联合使用
 * 以下代码执行顺序：
 * 		先执行try->再执行finally最后执行return
 * 		try {
			System.out.printfln("finally!!!");
			return;
		} finally {
			System.out.printfln("finally!!!");
		}
 *
 *	不执行finally：
 *		try {
			System.out.printfln("finally!!!");
			//退出JVM虚拟机
			System.exit;
		} finally {
			System.out.printfln("finally!!!");
		}
 */
public class practice_异常_finally {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			/**
			 * 创建输入流对象赋给fis
			 * 如果对象没创建成功
			 * fis为空
			 * finally中的代码也不会执行
			 * 以下判断为空
			 * 避免空指针异常
			 */
			fis = new FileInputStream("D:\\clipse\\work space\\1.13\\practice.txt");
			
			String string = null;
			string.toString();
			
			/**
			 * 流使用完需要关闭，以为流是占用资源的。
			 * 即使以上程序出现异常，流也必须关闭。
			 * 流的关闭放在这里不安全
			 */
			//fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			/**
			 * 流的关闭放在这里是比较保险的
			 * 即使try出现了异常finally中的代码也是一定会执行的
			 */
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
