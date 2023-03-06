package javase.advanced.泛型;

public class 自定义泛型<标识符随便写> {

	public static void main(String[] args) {
		
		/**
		 * 泛型：
		 * 		创建对象是指定String类型，就是String类型
		 * 		java原代码中经常出现的是：
		 * 			<E>和<T>
		 * 				E是Element单词首字母大写
		 * 				T是Type单词首字母大写
		 * 
		 */
		自定义泛型<String> z = new 自定义泛型();
		z.doSome("www.baidu.com");
	}
	
	private void doSome(标识符随便写 q) {
		System.out.println(q);
	}

}
