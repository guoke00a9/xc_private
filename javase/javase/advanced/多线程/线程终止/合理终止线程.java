package javase.advanced.多线程.线程终止;

public class 合理终止线程 {

	public static void main(String[] args) {

		MyRunale mr = new MyRunale();
		Thread t = new Thread(mr);
		t.setName("t");
		t.start();
		
		//模拟5秒
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//修改布尔标记
		mr.run = false;
	}

}
class MyRunale implements Runnable{
	
	//打一个布尔标记
	boolean run = true;
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (run) {
				System.out.println(Thread.currentThread().getName()+"--->"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}else{
					return;
			}
		}
	}
	
}