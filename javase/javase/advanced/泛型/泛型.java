package javase.advanced.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型：
 * 		JDK5.0之后推出的新特性
 * 		泛型是在编译阶段起的作用，给编译器看，运行阶段没有用。
 * 		
 * 		优点：用泛型来指定集合中存储对的数据类型，这样使用了泛型之后，集合中的数据更加统一了。
 * 		缺点：程序缺少了多样性。
 * 自动类型推断：
 * 		又称为砖石表达式。
 * 		ArrayList<这里的类型会自动推断>()，前提是JDK8之后的版本。
 * 		List<Animal> list = new ArrayList();
 */
public class 泛型 {

	public static void main(String[] args) {
		
		/**
		 * 不使用泛型机制，分析程序缺点
		 * 
		List list = new ArrayList();
		list.add(new Cat());
		list.add(new Bird());
		//创建迭代器对象
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object = it.next();
			obj中没有move方法，无法调用move，编译器无法通过，需要向下转型。
			if (object instanceof Animal) {
				Animal a = (Animal)object;
				a.move();
			}
		}
		 */
		
		/**
		 * 泛型机制:
		 * 		使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据。
		 * 		用泛型来指定集合中存储对的数据类型。
		 * 		这样使用了泛型之后，集合中的数据更加统一了。
		 */
		
		/**
		 * 
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("www.baidu.con");
		list1.add("www.guge.con");
		Iterator<String> it1 = list1.iterator();
		while (it1.hasNext()) {
			/**
			 * 泛型优点：
			 * 		直接调用String的substring方法截取字符串长度
			 * 		如果没有使用泛型
			 * 		需要先判断再转型才能使用substring方法
			 */
			System.out.println(it1.next().substring(5));
		}
		
		List<Animal> list = new ArrayList<Animal>();
		list.add(new Cat());
		list.add(new Bird());
		//表示迭代器迭代的是Animal类型
		Iterator<Animal> it = list.iterator();
		//使用泛型之后，每次迭代器迭代的类型都是Animal类型。
		while (it.hasNext()) {
			Animal a = it.next();
			//这里不需要强制类型转换，直接调用。
			a.move();
			}
		}
}

class Animal{
	public void move(){
		System.out.println("动物在移动！");
	}
}

class Cat extends Animal{
	private void catMouse() {
		System.out.println("猫抓老鼠！");
	}
}

class Bird extends Animal{
	private void birdMouse() {
		System.out.println("鸟儿在飞翔！");
	}
}
