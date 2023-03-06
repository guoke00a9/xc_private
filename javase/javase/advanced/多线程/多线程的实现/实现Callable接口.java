package javase.advanced.多线程.多线程的实现;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;//JUC包下的，属于java的并发包，老JDK中没有这个包，新特新

/**
 * 第三种:
 * 		实现Callable接口（JDK8新特性）
 * 			这种方式实现的线程可以获取线程的返回值。
 * 			前两中无法获取返回值。
 *
 */
public class 实现Callable接口{
	public static void main(String[] args) {
		//创建未来任务类对象
		@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
		FutureTask task = new FutureTask(new Callable() {
					public Object call() throws Exception {//call方法相当于run方法，只不过这个有返回值
						//线程执行任务，执行完之后有个返回值
						System.out.println("call begin");
						Thread.sleep(1000 * 10);
						System.out.println("call over");
						//return new Object();
						int a = 10;
						int b = 20;
						return a + b;//自动装箱(300变成Integer)
					}
		});
		
		//创建线程对象
		Thread t = new Thread(task);
		t.setName("t");
		t.start();
		
		//在主线程中怎么获得t线程的返回值
		try {
			/**
			 * 缺点:
			 * 		这个地方执行会阻塞当前线程
			 * 有点:
			 * 		或以获取到线程的执行结果的返回值
			 */
			Object obj = task.get();
			System.out.println("线程执行结果"+obj);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		//main方法这里的程序要执行必须等待get()方法的结束
		System.out.println("Hello World!");
	}
}