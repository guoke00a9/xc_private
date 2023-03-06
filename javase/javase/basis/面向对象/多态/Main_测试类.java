package javase.basis.面向对象.多态;

public class Main_测试类 {
	
	static {
		
	}
	public static void main(String[] args) {

		/*正常程序编写机制
		Animal a1 =new Animal();
		a1.move();
		
		Cat c1 = new Cat();
		c1.move();
		c1.catchMouse();
		
		Bird b1 = new Bird();
		b1.move();
		*/
		Animal animal = new Cat();//走猫步
		animal.move();//走猫步
		Cat cat = (Cat)animal;
		cat.catchMouse();//抓老鼠
		
		Animal a1 = new Bird();//在飞翔
		
		/**
		 * 只有访问子类对象当中特有的方法
		 * 		才会采用向下转型
		 * 		为了避免出现ClassCastExcoeption
		 * 		所以采用instanceof判断
		 */
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		}else if(a1 instanceof Bird){
			Bird b1 = (Bird)a1;
			b1.flu();//在觅食
		}
	}
	
}