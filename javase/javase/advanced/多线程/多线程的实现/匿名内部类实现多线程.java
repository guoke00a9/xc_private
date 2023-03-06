package javase.advanced.多线程.多线程的实现;

public class 匿名内部类实现多线程 {

	public static void main(String[] args) {

		/**
		 * 创建线程对象，采用匿名内部类方式。
		 */
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("分支线程--->"+i);
				}
			}
		});
		thread.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("主线程--->"+i);
		}
		
	}

}
