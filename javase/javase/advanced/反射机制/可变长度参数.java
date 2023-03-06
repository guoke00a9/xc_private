package javase.advanced.反射机制;


/**
 * 1.可变长度参数个数要求是0~N个
 * 2.可变长度参数在形式列表中必须在最后一个位置上，而且可变长度参数只能有一个
 * @author Passerby
 *
 */
public class 可变长度参数 {

	public static void main(String[] args) {

		m1();
		m1(111);
		m1(111,222,333);
		
		m2(null);
		m2("",111);
		m2("111", 222);
		
		m3("aaa","bbb","ccc");
		
		String[] strs = {"aaa","bbb","ccc"};
		m3(strs);
	}
 
	public static void m1(int... args) {
		System.out.println("m1方法执行!");
	}
	public static void m2(String args,int... args1) {
		System.out.println("m2方法执行!");
	}
	public static void m3(String... args) {
		//args有lengtj属性，说明args是一个数组
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
