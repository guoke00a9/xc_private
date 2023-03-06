package javase.advanced.多线程.多线程的实现;

/**
  		实现多线程的方式:
 			第一种:
  				编写一个类，直接继承java.lang.Thread，重写run方法。
  					//创建线程对象
					MyTgread mt = new MyTgread();
					//调用sun()方法不会启动线程，不会分配分支栈(这种方式就是单线程)
					//启动线程线程之后瞬间结束
					mt.start();
					//这里的代码运行在主线程中(主栈)。
					for (int i = 0; i < 1000; i++) {
						System.out.println("主线程--->"+i);
					}
 					class MyTgread extends Thread{
						public void run() {
							//编写程序，这段程序运行在分支线程中(分支栈)。
							for (int i = 0; i < 1000; i++) {
								System.out.println("分支线程--->"+i);
							}
						}
					}	
			第二种:
		 		创建一个可运行的类【】该类实现Runnable接口
		 		将可运行的类封装成一个线程对象
		 			Thread t = new Thread(new MyRunnable());
		 		启动线程
		 			t.start();
		 		第二种方式实现接口比较常用，因为一个类实现了接口，还可以去继承其他的类。
		 		
 */
/**
 * 					
 * 		创建线程对象:new。
 * 		启动线程:调用线程对象的start()。
 * 		
 * 		start():
 * 			启动一个分支线程，在JVM中开辟一个新的栈空间。
 * 			这段代码完成之后瞬间就结束了。
 * 			这段代码的认为只是为了开启一个新的栈空间，只要新的栈空间开出来。
 * 			start()方法就结束了。
 * 			启动成功的线程会自动调用run方法，并且run方法在分支栈的底部(压棧)。
 * @author Passerby
 *
 */
public class 实现Runnable接口 {
	/**
	 * 方法体当中的程序按照自上而下的顺序依次执行【亘古不变的】
	 * @param args
	 */
	public static void main(String[] args) {
		//这里是main方法，这里的代码属于主线程，在主栈中运行。
		/**
		 * 创建一个可运行的类
		 * 将可运行的类封装成一个线程对象
		 */
		Thread t = new Thread(new MyRunnables());
		//启动线程
		t.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("主线程--->"+i);
		}
	}
}
/**
 * 这并不是一个线程类，是一个可运行的类，它还不是一个线程。
 * @author Passerby
 *
 */
class MyRunnables implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("分支线程--->"+i);
		}
	}
}


