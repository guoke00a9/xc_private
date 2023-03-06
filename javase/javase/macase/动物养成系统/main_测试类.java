package javase.macase.动物养成系统;


/**
 * 多态在实际开发中的作用？
 * 	以主任喂养宠物为例：
 * 		1、分析主人喂养宠物这个场景要实现进行类型的抽象：
 * 			-主人【类】
 * 				主人可以喂养宠物，所以主人有喂养这个动作。
 * 			-宠物【类】
 * 				动物可以吃东西，所以动物有吃东西这个动作。
 * 		2、面向对象的编程的核心：-定义好类，然后将类实例化为对象，给一个环境驱使，让各个对象
 * 		   之间写作起来形成一个系统。
 * 		3、多态的作用：
 * 			降低程序的耦合度，提高程序扩展力。
 * 			能使用多态尽量使用多态。
 * 			父类型引用指向子类型对象。
 * 
 * 		核心：面向抽象编程，尽量不要面向具体编程。
 */
public class main_测试类 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		Dog dog = new Dog();
		
		Master wangjie = new Master();
		wangjie.feed(dog);
		
		wangjie.feed(new Cat());
	}
}
