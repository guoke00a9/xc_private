package javase.basis.java工具;

public class main测试类 {
		public static void main(String[] args) {
			Animal animal = new Animal();
			System.err.println(animal);
			new hh(3);
			System.out.println(animal.toString());
		}
}
class Animal{
		void shout() {
			System.out.println("动物叫！");
	}
}
