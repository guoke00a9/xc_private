package javase.advanced.enum枚举;

/**
 * 非enum类型
 * 枚举：
 * 		一枚一枚可以列举出来的，才建议使用枚举类型。
 * 		枚举编译之后也可以生成class文件。
 * 		枚举也是一种引用数据类型。
 * 		枚举中的每一个值都看作是常量。
 */
public class 枚举 {
	public static void main(String[] args) {
		
		System.out.println(divide(10, 2));
		System.out.println(divide(10, 0));
	}
	/**
	 * 计算两个数据的商
	 * @param a int类型的是数据
	 * @param b int类型的是数据
	 * @return 返回1成功，返回0失败。
	 */
	public static boolean divide(int a,int b) {
		try {
			int c = a / b;
			//程序执行到此处表示以上代码没有发现异常，表示成功返回1。
			return true;
		} catch (Exception e) {
			
			//程序执行到此处表示以上代码有发现异常，表示失败返回0。
			return false;
		}
	}
	/**
	 * 以上程序设计没问题，返回true和false两种情况
	 * 但以后的开发中，有可能遇到一个方法执行的结果
	 * 可能包括三种情况、四种情况、五种情况，但每一
	 * 种都可以数清楚的，一枚一枚都是可以列举出来的。
	 * 这种情况布尔类型就无法满足需求了，此时可以使用
	 * java语言中的枚举类型。
	 */
	/*
	 * 有设计缺陷
	public static int divide(int a,int b) {
		try {
			int c = a / b;
			//程序执行到此处表示以上代码没有发现异常，表示成功返回1。
			return 1;
		} catch (Exception e) {
			
			//程序执行到此处表示以上代码有发现异常，表示失败返回0。
			return 0;
		}
	}
	*/
}
