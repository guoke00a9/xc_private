package javase.basis.面向对象.多态;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("无参数构造方法！");
	}
//	public void move() {
//		System.out.println("猫儿在走猫步！");
//	}
	/***
	 * 子类中特有的行为/动作
	 */
	public void catchMouse() {
		System.out.println("猫抓老鼠！");
	}
}
