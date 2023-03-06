package javase.basis.面向对象.多态;
         
/**多态的语法机制：【多态的基础语法】
 *       
 *       关于多态的几种概念：
 *       	*向上转型（upcasting）
 *       		子类型-->父类型
 *       		又被称为：自动类型转换
 *       	*向下转型（downcasting）
 *       		父类型-->子类型
 *       		又被称为：强制类型转换【需要加强制类型转换符】
 *       	不管向上转型还是向上转型，两者之间都要有继承关系。（否者编译器报错，无法通过编译）
 *       
*/	
//-----------------------------------------------------------------	
/**使用多态语法机制
 * 1、Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
 * 2、Cat is a Animal   【合理的语法】
 * 3、new Cat()创建的对象的类型是Cat，ani这个引用类型是Animal，可见它们进行了类型转换
 * 	  子类型转换成父类型，称为向上转型/upcasting，或者称为自动类型转换。
 * 
 */
//Animal animal = new Cat();
/**
 * 1、java程序永远都氛围编译阶段和运行阶段
 * 2、先分析编译阶段，在分析运行阶段，编译无法通过，根本无法运行。
 * 2、编译阶段编译器检查animal这个引用的数据类型为Animal，由于Animal.class
 * 	  字节码中有，move()方法，所以编译器通过了。这个过程我们称为静态绑定，编译阶段绑定。
 * 	  只有静态绑定成功之后才有后续的运行。
 * 4、在程序运行阶段，JVM堆内存当中正式创建的对象是Cat对象，那么一下程序在运行阶段
 * 	  一定会调用Cat对象的move()方法，此时发生了程序的动态绑定，运行阶段绑定。
 * 5、无论是Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，因为底层
 * 	  真实对象就是Cat对象。
 * 6、父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同形态/状态，
 * 	  这种机制可以称为一种多态语法机制。
 */
		
/**分析一下程序为什么不能调用？
 * 		因为编译阶段编译器检查animal的类型是Animal类型，
 * 		冲Animal.class字节码文件当中查找不到caychMouse()
 * 		方法，导致静态绑定失败，没有绑定成功，也就是说编译
 * 		失败了更别谈运行了。
 */
//animal.catchMouse();
	
/**
 * 需求：
 * 	假设想让以上的对象执行catchMouse()方法，怎么办？
 * 		animal是无法直接调用的，因为animal的类型是Animal，Animal中没有catchMouse()方法。
 * 		我们可以将animal强制类型转换为Cat类型。
 * 		父类转子类被称为向下转型/downcasting/强制类型转换。
 *  注：向下转型也需要两种类型之间必须有继承关系。不然编译器报错。其中那个值类型转换需要加强制类型转换符。
 *  
 *  什么时候需要向下转型呢？
 *  	当调用的方法是子类型特有的，在父类型当中不存在，逆序向下转型。
 */
//Cat cat = (Cat)animal;
	
/**
 * 1、一下程序是没有问题的，因为编译器检查到a3的数据类型是Animal
 * 	  Animal和Cat之间存在继承关系，并且Animal是父类型，Cat是子类型
 * 	  父类型向子类型转换叫做向下转型，语法合格。
 * 2.、程序虽然编译通过了，但是程序运行阶段出现异常，因为JVM堆内存
 * 	  当中真实存在的对象是Bird类型，Brid对象无法转换成Cat对象，因为
 * 	  两种类型之间不存在任何继承关系，此时出现了著名的异常：
 * 				java.lang.ClassCastExcoeption
 * 				类型转换异常，这种异常总是在向下转型时发生。
 */
//Animal a1 = new Animal();
	//Cat c1 = (Cat)a1;
/**
 * 1、以上异常只有在强制类型转换的时候会发生，也就是说“向下转型”存在隐患（编译通过了，但运行错了！）
 * 2、向上转型编译通过，运行一定通过：Animal animal = new Cat();
 * 3、向下转型编译通过，运行可能错误：Animal a1 = new Animal(); Cat c1 = (Cat)a1;
 * 4、怎么避免向下转型出现的java.lang.ClassCastExcoeption呢？
 * 		使用instanceo运算符可以避免以上的异常。
 * 5、instanceo运算符怎么用？
 * 		5.1语法格式：
 * 			(引用 instanceo 数据类型名)
 * 		5.2以上运算符的执行结果是布尔类型，结果可能是true/false
 * 6、java规范中要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCastExcoeption
 */
//--------------------------------------------------------------
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
 * 		3、多态的作用
 * 
 */
        