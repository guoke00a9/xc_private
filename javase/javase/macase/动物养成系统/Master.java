package javase.macase.动物养成系统;

/**
 * 主人
 * 
 * Master和Cat、Dog这两个类型的关联程度很强，耦合度很高，扩展力差。
 */
//降低程序的耦合度【解耦合】，提高程序的扩展力【软件开发的一个很重要的目标】
/*
public class Master {
	public void feed(Cat c1) {
		c1.feed();
	}
	public void feed(Dog d1) {
		d1.feed();
	}
}
*/
//
/**
 * Master主人类面向的是一个抽象的Pet，不在面向具体的宠物
 * 提倡：面向抽象编程，不要面向具体编程。
 * 面向抽象编程的好处是，耦合度低，扩展力强。
 */
public class Master{
	/**
	 * feed(Pet pet)=(Pet pet = new Dog();)
	 * feed(Pet pet)=(Pet pet = new Cat();)
	 */
	public void feed(Pet pet) {
		pet.eat();
	}
}
