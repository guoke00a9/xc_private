package javase.advanced.stringbuffer字符串;

/**
 * StringBuffer中的方法都有synchronize关键字修饰
 * 表示StringBuffer在多线程模式下是安全的
 * StringBuder中的方法都没有synchronize关键字修饰
 * 表示StringBuder在多线程模式下是不安全的
 * @author 王爸爸
 *
 */
public class StringBuilderPractice {
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		
		str.append("2001");
		str.append("12");
		str.append("16");
		System.out.println(str);
	}
}
