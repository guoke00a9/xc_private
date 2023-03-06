package javase.advanced.反射机制;

public class ClassForName {

	public static void main(String[] args) {

		try {
			//Class.forName()这个方法的执行会导致：类加载。
			Class.forName("priv.xc.javase.advanced.反射机制.MyClass");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
class MyClass{
	//静态代码块，类加载时候执行
	static {
		System.out.println("MyClass类的静态代码块执行了！");
	}
}