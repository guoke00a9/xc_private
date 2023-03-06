package javase.advanced.exception异常;

/**
 * 异常机制：
 * 		异常：
 * 			程序出现了不正常的情况，称为异常。
 * 		异常是以类的形式存在的，每一个异常类都可以创建对象。
 */


/**
 * 经典异常：
 * 		空指针异常：NullPointerException
 * 		类型转换异常：ClassCastException
 * 		数组下标越界异常：IndexOutOfBoundsException
 * 		数字格式化异常：NuberFormatException
 *
 */
public class 异常 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int a = 10;
		int b = 0;
		int c = a / b;
		/**
		 * 实际上JVM在执行到此处的时候，会new异常对象：new ArithmeticException: / by zero
		 * 并且打印输出异常
		 */
		NumberFormatException nde = new NumberFormatException("数字格式化异常！！！");
		//java.lang.NumberFormatException: 数字格式化异常！！！
		System.out.println(nde);
		
		NullPointerException npe = new NullPointerException("空指针异常发生了！！！");
		//java.lang.NullPointerException: 空指针异常发生了！！！
		System.out.println(npe);
	}

}
