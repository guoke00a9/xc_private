package javase.macase.模拟账户取款.非线程安全;

public class main测试类 {

	public static void main(String[] args) {
		//创建账户对象
		Accout act = new Accout("vip-001",10000);
		
		//创建两个线程
		Thread t1 = new AccoutThread(act);
		Thread t2 = new AccoutThread(act);
		//设置线程name
		t1.setName("t1");
		t2.setName("t2");
		//启动线程开始取款
		t1.start();
		t2.start();
	}

}
