package javase.macase.模拟账户取款.线程安全;

/**
 * Accout:
 * 		银行账户
 * 		不适用线程同步机制，多线程对同一个账户进行取款，出现出现线程安全问题。
 * @author Passerby
 *
 */
public class Accout {

	Object obj = new Object();
	//账号
	private String actino;
	//余额
	private double balance;
	public Accout() {
		super();
	}
	public Accout(String actino, double balance) {
		this.actino = actino;
		this.balance = balance;
	}
	public String getActino() {
		return actino;
	}
	public void setActino(String actino) {
		this.actino = actino;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//取款方法
	public void withdraw(double money) {
		/**
		 * 以下这几行代码必须是线程排队的，不能并发。
		 * 一个线程把这里的代码全部执行结束之后，另一个线程才能进来。
		 * 线程同步机制:
		 * 		synchronized (){}
		 * 		synchronized后面的小括号中传的这个“数据”是非常关键的
		 * 		这个数据必须是多线程共享的数据，才能达到多线程排队
		 * 
		 * 		()怎么写？:
		 * 			要看需要让那些线程同步
		 */
		//Object obj2 = new Object();//局部变量
		//synchronized (obj2) {//这样编写不安全，因为obj不是共享独享
		synchronized (obj) {//这样编写不安全，因为obj不是共享独享
		//synchronized ("abc") {//"abc"在字符串常量池当中
		//synchronized (null) {//空指针异常
		//synchronized (this) {
			double before= this.getBalance();
			double after = before - money;
			    try {
			    	//在这里模拟一下网络延迟，程序必定出问题
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			this.setBalance(after);
		}
	}
	/**
	 * synchronized:
	 * 		在实例方法上使用synchronized，一定锁的是this。
	 * 		没得挑，只能是this，不能是其他对象了。
	 * 
	 * 		优点:
	 * 			代码少，节俭了。
	 * 		缺点:
	 * 			synchronized出现在实例方法上，
	 * 			表示整个方法体都需要同步，可能会无故扩大
	 * 			同步范围，导致程序的执行效率降低。
	 * 		synchronize出现在静态方法上锁的是类锁
	 */
//	public synchronized void withdraw(double money) {
//			double before= this.getBalance();
//			double after = before - money;
//			    try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			this.setBalance(after);
//	}
}
