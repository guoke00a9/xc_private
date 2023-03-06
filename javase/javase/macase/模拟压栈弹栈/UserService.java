package javase.macase.模拟压栈弹栈;

public class UserService {
	
	private String user;
	private String password;
	
	public void register(String user,String password) throws MyException {
		if (null == user || user.length() < 6 || user.length() >16) {
			//用户名不合法，长度必须在[6-16]之间
			throw new MyException("用户名不合法，长度必须在[6-16]之间");
		}
		//程序执行到此处，说明用户名合法
		System.out.println("注册成功，欢迎"+user+"。");
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
