package javase.advanced.多线程.线程终止;

public class 强行终止线程的执行 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			//子类重写父类的方法不能比父类抛出更宽泛的异常
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						System.out.println(Thread.currentThread().getName()+"--->"+i);
						//睡眠1秒
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("睡眠中断");
					}
				}
			}
		}) ;
		
		t.setName("t");
		t.start();
		
		//模拟5秒
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/**
		 * 5秒之后强行终止t线程
		 * 这种方式有很大的缺点，容易丢失数据，因为是直接将线程强行终止了
		 */
		t.stop();
		
	}

}
