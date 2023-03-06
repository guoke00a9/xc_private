package javase.basis.访问控制修饰符;

/**
 * 关于java语言当中final关键字：
 * 		1、final是一个关键子，表示最终的，不可变的。
 * 		2、final修饰的类无法被继承。
 *      3、final修饰的方法无法被覆盖。
 *      4、final修饰的变量一旦被赋值，不可再重新赋值。
 *      	*final int x = 10
 *      	*final int y;
 *      	*y=10;
 *      5、final修饰的实例变量
 *      	--成员变量之实例变量
 *      	--成员变量有默认值 final修饰的变量一旦赋值不能重新赋值
 *      	--实例变量采用final修饰之后，必须手动赋值，不能采用系统默认值。
 *      		*第一种方案
 *      		final int a = 10;
 *      		*第二种方案 需要在构造方法assignment中赋值
 *      		final int x;
 *      		public assignment(){
 *      			this.x = 100;
 *      		}
 *      6、final修饰的引用
 *      	--final修饰的引用，一旦指向某个对象之后，不能再指向其他对象，那么
 *      	  被指向的对象不能被垃圾回收器回首。
 *      		*Animal animal = new Animal(10); animal=0x1234;
 *      		*aninal = new Animal(12); animal=0x1235;
 *      		*final Animal a1 = new Animal(20);
 *      		*a1 = new Animal(22);   编译报错
 *      	--被final修饰的引用虽然不能被修改，但是final指向的对象的属性可以被修改。
 *      		*a1.age=22；
 * ********************************************************************************
 *      7、final修饰的实例变量,一般和static联合使用，被称为“常量”；
 *      
 */
