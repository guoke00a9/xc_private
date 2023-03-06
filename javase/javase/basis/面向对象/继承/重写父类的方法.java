package javase.basis.面向对象.继承;

public class 重写父类的方法 {
		public static void main(String[] args) {
			System.out.println("重写父类方法之前"
					+ "----------------------");
			Animal animal = new Animal();
			animal.information();
			System.out.println("重写父类方法之后"
					+ "----------------------");
			Dog dog = new Dog();
			dog.setName("张三");
			dog.setType(20);
			dog.information();//
			System.out.println("----------"
			+ "---------------------------");
			dog.Animal();//对象调用无参构造
			animal.Animal();//对象调用无参构造
			System.out.println("----------"
			+ "---------------------------");
			Dog.fmethod();//类名调用静态方法
		}
}

class Dog extends Animal{
	static String addr="河南驻马店";
	public void iinformation() {
		System.out.println("name："+getName()+",age:"+getType()+",addr"+addr);
	}
	
	
	public static void fmethod(){
		System.out.println("无参方法");
	}
	
}
class Animal{
	private String name="王杰";
	private int type=18;
	
	public void Animal(){
		System.out.println("无参构造");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void information() {
		System.out.println("姓名："+name+",年龄."+type);	
	}
	
}
