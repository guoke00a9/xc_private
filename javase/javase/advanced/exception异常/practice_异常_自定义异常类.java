package javase.advanced.exception异常;

/**
 * SUN提供的JDK内置的异常肯定是不够用的。
 * 在实际开发中，有很多业务，这些业务出现异常后，JDK中都是没有的，和业务挂钩的。
 * 那么这些异常类我们需要自己写。
 * 自定义异常类：
 * 		第一步：
 * 			编写一个类继承Exception或者RuntimeException
 * 		第二步：
 * 			提供两个构造方法，一个无参的一个有参的。
 *	
 */
public class practice_异常_自定义异常类 {
	public static void main(String[] args) {
		
		MyException me = new MyException("自定义异常！");
		//打印异常堆栈追踪信息
		me.printStackTrace();
		//打印简单异常描述
		System.out.println(me.getMessage());
	}
}
/**
 * MyException：自定义异常类
 */
/*
class MyException extends Exception{
	
	public MyException() {
		
	}
	public MyException(String name) {
		super(name);
	}
}
*/
class MyException extends Exception{
	
	public MyException() {
		
	}
	public MyException(String name) {
		super(name);
	}
}
