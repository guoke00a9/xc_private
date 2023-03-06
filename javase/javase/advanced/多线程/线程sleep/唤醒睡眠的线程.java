package javase.advanced.多线程.线程sleep;

public class 唤醒睡眠的线程 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			//子类重写父类的方法不能比父类抛出更宽泛的异常
			public void run() {
				System.out.println(Thread.currentThread().getName()+"--->begin");
				try {
					//睡眠一年
					Thread.sleep(1000 * 60 *60 *24 *365);
				} catch (InterruptedException e) {
					//e.printStackTrace();
					System.out.println("睡眠中断");
				}
				System.out.println(Thread.currentThread().getName()+"--->end");
			}
		}) ;
		
		t.setName("t");
		t.start();
		
		/**
		 * 终止线程的睡眠，不是终止程序的执行
		 * 希望5秒之后t线程醒来，这时候main()主线程的的代码已经执行完
		 * 这种中断的方式依靠了Java的异常处理机制
		 */
		try {
			//模拟主线程工作
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//终断t线程的睡眠
		t.interrupt();
	}

}
