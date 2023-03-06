package javase.advanced.exception异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class practice_异常_trycatch {
/**
 * 一般不建议在main方法上使用throws，因为异常如果发生了，一定会抛给JVM，JVM只有终止程序。
 * 异常处理机制的作用就是增强程序的健壮性，怎么能做到，异常发生了也不影响程序的执行。
 * 所以一般main方法中的异常建议使用try..catch进行捕捉，main就不要继续上抛了。
 */
	/*
	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	*/
	public static void main(String[] args){

		System.out.println("main begin");
		try {
			m1();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在，可能路径错误，也可能该文件被删除了！");
		}
		System.out.println("main over");
	}

	private static void m1() throws FileNotFoundException {
		
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}
	//抛异常可以多个也可以抛父类型异常
	private static void m2() throws FileNotFoundException {
		
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}

	private static void m3() throws FileNotFoundException {
	
		/**
		 * 调用SUM jdk中某个类的构造方法
		 * 这个类暂时没学 后期IO流的内容
		 * 借助这个类学习异常处理机制
		 * 创建一个输入流对象 该流指向一个文件
		 */
		/**
		 * 编译报错的原因？
		 * 		调用构造方法：FileInputStream(String name)
		 * 		这个构造方法的声明位置上有：throws FileNotFoundException
		 */
		new FileInputStream("D:\\clipse\\work space\\1.13\\practice.txt");
	}

}
