package javase.basis.面向对象.抽象;

//子类【非抽象的】
class Bird extends Animal{

	//需要把重父类中继承过来的抽象方法进行覆盖/重写，也可以叫“实现”。
	public void move() {
		System.out.println("实现抽象方法！");
		
	}
}
