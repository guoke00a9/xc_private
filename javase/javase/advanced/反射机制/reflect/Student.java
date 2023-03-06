package javase.advanced.反射机制.reflect;

public class Student {

	/**
	 * field翻页为字段，其实就是属性/成员
	 * 4个field分别采用了不同的访问控制权限修饰符
	 */
	public String name;
	private String no;
	protected int age;
	boolean sex;
	private String password;
	
	public boolean login(String no,String pawd) {
		if ("10144".equals(no) && "1216".equals(pawd)) {
			return true;
		}
		return false;
	}
	
	public Student(){
		
	}
	public Student(String no, String password) {
		super();
		this.no = no;
		this.password = password;
	}
	
	public Student(String name, String no, int age, boolean sex, String password) {
		super();
		this.name = name;
		this.no = no;
		this.age = age;
		this.sex = sex;
		this.password = password;
	}

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", age=" + age + ", sex=" + sex + ", password=" + password
				+ "]";
	}

}
