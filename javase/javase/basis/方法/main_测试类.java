package javase.basis.方法;

public class main_测试类 {
	public static void main(String[] args) {
		//Constructor測試類
		//有參構造
		new Constructor(10);
		//有參構造 創建對象	
		Constructor co = new Constructor(10);
		Object object = new Object();
		//引用.方法名
		co.constructor();
		//類名.方法名
		Constructor.constructor1();
		
		new Constructor();	
	}
}

class Constructor{
	public Constructor() {
		System.out.println("我是一個無參構造");
	}
	public Constructor(int x) {
		System.err.println("我是一個有參構造");
	}
	public void constructor() {
		System.err.println("我是使用引用.方法名調用");
	}
	public static void constructor1() {
		System.out.println("我是使用類名.方法名調用");
	}
}
