package javase.advanced.object超类;

public class Object_toString {
	public static void main(String[] args) {
		
		/**
		 * toString方法需重写
		 * 
		 * Animal animal = new Animal();
		 * 重写前
		 * System.out.println(animal);//输出对象pringln方法也会默认调toString方法
		 * System.out.println(animal.toString());
		 * 输出结果： com.my.javaSE.Object.Animal@4517d9a3
		 */
		Animal animal = new Animal("猫");
		System.out.println(animal);
		
	}
}
class Animal{
	
	String name;
	
	public Animal(){
		
	}
	public Animal(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
	
}
