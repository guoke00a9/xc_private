package javase.macase.银行登陆系统;

public class main测试类 {
	public static void main(String[] args) {
		Bank.bankName="建设银行";
		Bank.welcome();
		Bank bank= new Bank("超哥","1216",100.0);
		bank.deposit(1000);
		bank.withdrawal("1111", 500);
		bank.withdrawal("1216", 5000);
		bank.withdrawal("1216", 500);
		bank.checkTheBalance();
		Bank.aaa();
	}
}
