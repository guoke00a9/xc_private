package javase.macase.模拟JDBC;

public class MySQLJdbc implements JDBC{

	@Override
	public void getLink() {
		System.out.println("Mysql连接成功！");
	}
}
