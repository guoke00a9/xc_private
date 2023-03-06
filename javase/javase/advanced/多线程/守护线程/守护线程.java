package javase.advanced.多线程.守护线程;

public class 守护线程 {

	public static void main(String[] args) {

		Thread t = new BaDataThread();
		t.setName("备份线程");
		//启动线程之前，将线程设置为守护线程
		t.setDaemon(true);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
class BaDataThread extends Thread{
	public void run() {
		int i = 0;
		while (true) {
			System.out.println(Thread.currentThread().getName()+"--->"+(++i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}