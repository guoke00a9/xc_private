package javase.basis.方法;
public class Text {
	public static void method1() {
		//完整调用doSome
		Text.doSome();
		//省略调用doSome
		doSome();
		Text t =  new Text();
		//完整调用doOther
		t.doOther();
		/**省略调用doOther
		 * 静态方法无法省略调用实例方法
		 */
		//完整调用i
		System.out.println(t.i);
		//省略调用i
		//静态方法无法省略调用实例变量
	}
	public void method2() {
		//完整调用doSome
		Text.doSome();
		//省略调用doSome
		doSome();
		//完整调用doOther
		this.doOther();
		//省略调用doOther
		doOther();
		//完整调用i
		System.out.println(this.i);
		//省略调用i
		System.out.println(i);		
	}
	public static void main(String[] args) {
		/**
		 * 要求在这里编写程序调用method1
		 * 使用完整方式调用
		 * 使用省略方式调用
		 */
		Text.method1();
		method1();
		/**
		 * 要求在这里编写程序调用method2
		 * 使用完整方式调用
		 * 使用省略方式调用
		 */
		Text t = new Text();
		t.method2();
		//静态方法无法省略调用实例方法
	}
	int i = 10;
	public static void doSome() {
		System.out.println("doSome");
	}
	public void doOther() {
		System.out.println("doOther");
	}
}
