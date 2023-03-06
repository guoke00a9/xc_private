package javase.advanced.多线程;

public class 获取线程的名字 {

	public static void main(String[] args) {

		/**
		 * currentThread获取的就是当前线程对象
		 * 这个方法出现main方法当中，所以当前线程就是主线程
		 */
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		//创建线程对象
		MyTgread mt = new MyTgread();
		//设置线程名字
		mt.setName("MyT");
		//获取线程名字
		System.out.println(mt.getName());
		//启动线程
		mt.start();
		
		MyTgread mt1 = new MyTgread();
		mt1.start();
	}
}
class MyTgread extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()+"--->"+i);
		}
	}
}