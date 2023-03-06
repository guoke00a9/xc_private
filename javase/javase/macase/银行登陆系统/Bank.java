package javase.macase.银行登陆系统;

public class Bank {
	 static String bankName;
	 private String name;
	 private String password;
	 private double balance;
	 @SuppressWarnings("unused")
	private double turnovre;
	 static void welcome()
	 {
		 System.out.println("欢迎来到"+bankName+"-------------");
	 }
	 
	 //构造方法   开户
	 public Bank(String name,String password,double turnovre)
	 {
		 this.name=name;
		 this.password=password;
		 this.turnovre=turnovre;
		 this.balance=turnovre-10;
		 
		 System.out.println(name+"开户成功，账户余额"+this.balance+"元。");
	 }
	 //存款
	 public void deposit(double turnovre)
	 {
		 this.balance = balance + turnovre;
		 System.out.println(name+"您好，您的账户已存入"+turnovre+"当前余额"+balance+"元。");
	 }
	 public void withdrawal(String password,double turnovre)
	 {
		 if(this.password!=password)
		 {
			 System.out.println("您输入的密码有误，请从新输入。");
		 }
		 if(this.balance-turnovre>0)
		 {
			 this.balance=balance-turnovre;
		 }else {
			 System.out.println("余额不足，请重输入。");
		 }
	 }
	 public void checkTheBalance()
	 {
		 System.out.println("尊敬的"+name+"用户，您的余额是"+this.balance+"元");
	 }
	 static void aaa()
	 {
		 System.out.println("欢迎再次来到"+bankName+"------------");
	 }
}
