package javase.advanced.多线程.多线程并发安全;

public class main测试类 {

	public static void main(String[] args) {
		//创建账户对象
		Accout act = new Accout("vip-001",10000);
		Accout act1 = new Accout("vip-001",10000);
		//创建两个线程
		Thread t1 = new AccoutThread(act);
		Thread t2 = new AccoutThread(act);
		Thread t3 = new AccoutThread(act1);
		//设置线程name
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		//启动线程开始取款
		t1.start();
		t2.start();
		t3.start();
	}

}
