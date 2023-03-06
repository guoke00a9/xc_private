package javase.macase.模拟账户取款.非线程安全;

/**
 * Accout:
 * 		银行账户
 * 		不适用线程同步机制，多线程对同一个账户进行取款，出现出现线程安全问题。
 * @author Passerby
 *
 */
public class Accout {

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
		//取款前余额
		double before= this.getBalance();
		//取款后余额
		double after = before - money;
		
		/**
		 * 在这里模拟一下网络延迟，程序必定出问题
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 */
		
		//更新余额
		this.setBalance(after);
	}
}
