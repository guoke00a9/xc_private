package javase.advanced.多线程;

import java.util.ArrayList;
import java.util.List;

/**
 * wait:
 * 		Object o = new Object();
 * 		o.wait,表示当前对象上活动的线程进入等待，无期限等待，直到被唤为止。
 * 		o.wait()方法会让正在o对象上活动的当前线程进入等待状态，并且释放之前占有的o对象的锁。
 * 		o.wati()让正在o对象上获取的线程t进入等待状态，并且释放掉t线程占有之前o对象的锁。
 * notify:
 * 		o.notify()方法只会通知，不会释放值之前占有的o对象的锁。
 * 		o.notify()让正在o对象上等待的线程唤醒。
 * 		
 */
public class 生产者和消费者模式 {

	public static void main(String[] args) {

		/**
		 * 使用wait和notify方法实现“生产者和消费者模式”
		 * 		生产线程负责生产，消费线程负责消费
		 * 		生产线程和消费线程要达到均衡
		 * 		这是一种特殊的业务需求，在这种特殊的情况下需要使用wait和notify方法来实现
		 * wait和noyify方法不是线程对象的方法，是jaa对象都有的的方法
		 * wait和notify方法建立在线程同步的基础之上，因为多线程要同时操作一个仓库，有线程安全问题。
		 * 
		 */
		
		/**
		 * 仓库采用List集合
		 * List集合中假设只能存储一个元素
		 * 1个袁元素满了就表示满了
		 * 如果List集合为空，就表示仓库空了
		 * 保证仓库永远最多存储1个元素
		 */
		
		//创建一个仓库对象，共享的
		List list = new ArrayList();
		//消费者线程
		Thread t1 = new Thread(new Prouducer(list));
		t1.setName("生产者线程:");
		//生产者线程
		Thread t2 = new Thread(new Consumer(list));
		t2.setName("消费者线程:");
		t1.start();
		t2.start();
		
	}

}
/**
 * 生产线程
 */
class Prouducer implements Runnable{
	//仓库
	private List list;
	
	public Prouducer(List list) {
		this.list = list;
	}
	public void run() {
		//一直生产
		while (true) {
			/**
			 * 给仓库对象list加锁
			 */
			synchronized (list) {
				/**
				 * 大于0说明仓库中有一个元素了
				 * 当前线程进入等待状态，并且释放list集合的锁
				 */
				if (list.size() > 0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//程序能执行到这里说明仓库是空的，可以生产
				Object obj = new Object();
				list.add(obj);
				System.out.println(Thread.currentThread().getName()+"--->"+obj);
				//唤醒消费者消费
				list.notify();
			}
		}
	}
	
}
/**
 * 消费线程
 */
class Consumer implements Runnable{
	//仓库
	private List list;
	
	public Consumer(List list) {
		this.list = list;
	}
	public void run() {
		//一直消费
		while (true) {
			synchronized (list) {
				if (list.size() == 0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//程序能执行到这里说明仓库中有数据，进行消费
				Object obj = list.remove(0);
				System.out.println(Thread.currentThread().getName()+"--->"+obj);
				//唤醒生产者生产
				list.notify();
			}
		}
	}
	
}
