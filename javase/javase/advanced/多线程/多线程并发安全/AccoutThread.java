package javase.advanced.多线程.多线程并发安全;

public class AccoutThread extends Thread{
	
	//两个线程必须共享一个账户对象
	private Accout act;
	 
	//通过构造方法传过来账户对象
	public AccoutThread() {
		
	}
	public AccoutThread(Accout act) {
		this.act = act;
	}
	public void run() {
		/**
		 * run()方法的执行表示开始取款
		 * 假设取款5000
		 */
		double money = 5000;
		act.withdraw(money);
		System.out.println(Thread.currentThread().getName()+"对账号"+act.getActino()+"取款"+money
				+ "成功，余额："+act.getBalance());
	}
}
