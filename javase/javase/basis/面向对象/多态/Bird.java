package javase.basis.面向对象.多态;

public class Bird extends Animal{
	
	public void move() {
		System.out.println("鸟儿在飞翔！");
	}
	/**
	 * 子类中特有的行为/动作
	 */
	public void flu() {
		System.out.println("鸟儿在觅食！");
	}
}
