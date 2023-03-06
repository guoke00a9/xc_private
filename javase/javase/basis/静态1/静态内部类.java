package javase.basis.静态1;

public class 静态内部类 {

	public static class MyClass{
		
		public static void m1(){
			System.out.println("静态内部类的m1方法执行！");
		}
		public void m2(){
			System.out.println("静态内部类的m2实例方法执行！");
		}
	}
	public static void main(String[] args) {

		//调用内部类m1方法
		MyClass.m1();
		//调用内部类m2方法
		MyClass m2 = new MyClass();
		m2.m2();
	}

}
