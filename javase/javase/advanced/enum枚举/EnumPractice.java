package javase.advanced.enum枚举;

public class EnumPractice {
	public static void main(String[] args) {
		
		System.out.println(divide(10, 1));
	}
	/**
	 * 
	 * @param a int数据
	 * @param b int数据
	 * @return	返回Resule.SUCCESSD表示成功,返回Resule.FAIL表示失败
	 */
	public static Resule divide(int a,int b) {
		try {
			int c = a / b;
			//程序执行到此处表示以上代码没有发现异常，表示成功返回1。
			return Resule.SUCCESSD;
		} catch (Exception e) {
			
			//程序执行到此处表示以上代码有发现异常，表示失败返回0。
			return Resule.FAIL;
		}
	}
}
/** 
 * 枚举：
 * 		一枚一枚可以列举出来的，才建议使用枚举类型。
 * 		枚举编译之后也可以生成class文件。
 * 		枚举也是一种引用数据类型。
 * 		没居中的每一个值都看作是常量。
 */
enum Resule{
	//SUCCESS是枚举Result中的一个值
	//FAIL是枚举Result中的一个值
	//枚举中的每一个值，都可以看做是“常量”
	SUCCESSD,//成功
	FAIL//失败
}
