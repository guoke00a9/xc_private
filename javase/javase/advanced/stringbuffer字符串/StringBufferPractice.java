package javase.advanced.stringbuffer字符串;

/**
 * 实际开发过程中，java中的字符串是不可变的，每一次拼接都会产生新的字符串
 * 而字符串存在方法区常量池，造成内存空间浪费。
 */
public class StringBufferPractice {
	public static void main(String[] args) {
		
		//创建一个初始化容量为16个byte[]数组（字符串缓冲区）
		StringBuffer stringBuffer = new StringBuffer();
		//创建一个初始化容量为50个byte[]数组（字符串缓冲区）
		StringBuffer sb = new StringBuffer(50);
		//拼接字符串 拼接字符串同意调用append()方法。
		stringBuffer.append("a");
		stringBuffer.append("c");
		stringBuffer.append("e");
		System.out.println(stringBuffer);
	}
}
