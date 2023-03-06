package javase.advanced.多线程.多线程的实现;

public class 继承Thread类 {

	public static void main(String[] args) {

		/*
		实现多线程的方式:
 			第一种:
  				编写一个类，直接继承java.lang.Thread，重写run方法。
  				*/
  					//创建线程对象
					MyTgread mt = new MyTgread();
					//调用sun()方法不会启动线程，不会分配分支栈(这种方式就是单线程)
					//启动线程线程之后瞬间结束
					mt.start();
					//这里的代码运行在主线程中(主栈)。
					for (int i = 0; i < 1000; i++) {
						System.out.println("主线程--->"+i);
					}
	}

}
class MyTgread extends Thread{
	public void run() {
		//编写程序，这段程序运行在分支线程中(分支栈)。
		for (int i = 0; i < 1000; i++) {
			System.out.println("分支线程--->"+i);
		}
	}
}	
