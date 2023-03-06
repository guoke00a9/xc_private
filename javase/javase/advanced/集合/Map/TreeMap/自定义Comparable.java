package javase.advanced.集合.Map.TreeMap;

import java.util.TreeSet;

public class 自定义Comparable {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(18);
		Customer c2 = new Customer(20);
		Customer c3 = new Customer(15);
		Customer c4 = new Customer(28);
		
		TreeSet<Customer> customer = new TreeSet<>();
		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
		
		//遍历
		for (Customer c : customer) {
			System.out.println(c);
		}
		
	}

}

/**
 * 放在TreeSet集合中的元素需要实现java.lang.Comparable接口。
 * 并且实现comparTo方法。
 * equals可以不写。
 * @author Passerby
 *
 */
class Customer implements Comparable<Customer>{
	
	int age;
	public Customer() {
		
	}
	public Customer(int age) {
		this.age=age;
	}
	
	/**
	 * 需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较！
	 * 		c1.comparTo(c2);
	 * 			this是c1
	 * 			c是c2
	 * 		c1和c2比较就是this和c比较
	 * 比较规则最终还是由程序员决定的：列入按照年龄升序。
	 */
	public int compareTo(Customer c) {
		//0or整数or负数 升序
		//return this.age - c.age;
		//0or整数or负数 降序
		return c.age - this.age;
	}
	public String toString() {
		return "age="+age;
	}
}