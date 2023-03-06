
package javase.advanced.exception异常;


public class practice_异常_final_finally_finalize {

	public static void main(String[] args) {
		
		//final是一个关键，表示最终的，不可变的。
		final int i = 100;
		//i = 101;
		
		//finally也是一个关键字，和try联合使用，使用在异常处理机制中，在finally中的代码一定会执行。
		try {
			return;
		} finally {
			System.out.println("Hllor World!");
		}
	}
}
