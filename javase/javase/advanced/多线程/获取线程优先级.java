package javase.advanced.多线程;

public class 获取线程优先级 {

	public static void main(String[] args) {

		System.out.println("最高优先级"+Thread.MAX_PRIORITY);
		System.out.println("最低优先级"+Thread.MIN_PRIORITY);
		System.out.println("默认优先级"+Thread.NORM_PRIORITY);
		
		//获取当前线程对象，获取当前线程的优先级
		Thread currenThread = Thread.currentThread();
		/**
		 * 设置线程优先级
		 * 		Thread.currentThread().setPriority(1);
		 * 线程让位
		 * 		Thread.yield();
		 * 合并线程，单线程变成多线程
		 * 		Thread t =new Thread(new MyRunable());
		 * 		System.out.println("main begin");
		 * 		t.join();
		 *		/t合并到当前线程中，当前线程受到阻塞，t执行到直到线程结束
		 * 		System.out.println("main over");
		 * 		
		 */
		
		System.out.println(currenThread.getName()+"线程的优先级"+currenThread.getPriority());
		
		Thread t =new Thread(new MyRunable());
		t.setName("t");
		t.start();
		
		
	}

}
class MyRunable implements Runnable{

	public void run() {
		//获取线程优先级
		System.out.println(Thread.currentThread().getName()+"线程的默认优先级是:"+Thread.currentThread().getPriority());
	}
	
}