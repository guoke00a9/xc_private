package javase.advanced.object超类;

/**
 * 源代码：
 * 		public native int hashCode();
 * 		这个方法不是抽象方法，带有native的底层调用c++
 * 		hashCode()方法返回的是哈希码：
 * 			实际上就是一个java对象的内存地址
 * 			经过哈希算法得出一个值
 * @author 王爸爸
 *
 */
public class Object_hashCode {
	public static void main(String[] args) {
		
		Animall a = new Animall();
		int hashValue = a.hashCode();
		System.out.println(hashValue);
	}
}
