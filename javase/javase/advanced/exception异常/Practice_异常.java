package javase.advanced.exception异常;

/**
 * 以下代码报错的原因是什么？
 * 		因为doSome()方法声明位置上使用了：throws ClassNotFoudException
 * 		而ClassNotFoundException是编译是异常，必须编写代码处理，没有处理编译器报错。
 */
public class Practice_异常 {
/**
 * 第一种处理方式：
 * 		在方法声明的位置上使用throws，来完成继续上抛，抛给调用者。
 * 第二中处理方式：
 * 		使用try..catch进行捕捉。
 * 异常_上报和处理怎么选择
 * 		如果需要调用者处理异常选择抛异常
 */
	public static void main(String[] args) {
		/**
		 * main方法中调用doSome()方法
		 * 因为dopSome()方法声明位置上有：throws ClassNotFoundException
		 * 如果不处理，编译器就会报错
		 * 编译器报错信息：Unhandled exception：java.lang.ClassNotFoundExcepttion
		 * doSome();
		 */
		
		try {
			doSome();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	/**
	 * dopSome()方法声明位置使用了throws ClassNotFoundException
	 * 这个代码表示doSome()方法在执行过程中有可能出现ClassNotFoundException
	 * 叫做类没找到异常，这个异常直接父类是：Exception，所以ClassNotFoundException属于编译时异常
	 */
	
	public static void doSome() throws ClassNotFoundException{
		System.out.println("ClassNotFoundException");
	}
}
