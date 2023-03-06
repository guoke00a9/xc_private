package javase.advanced.集合.cllection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection常用方法：
 * 		boolean add(Object e);
 * 			向集合中添加元素
 * 		int size();
 * 			获取集合个数
 * 		void clear();
 * 			清空集合
 * 		boolean contains(Object o);
 * 			判断当前集合中是否包含元素o
 * 			包含返回true，不包含返回false
 * 		boolean remove();
 * 			删除集合中的某个元素
 * 		boolean isEmpty();
 * 			判断集合中元素的个数是否为0
 * 			是返回true不适返回false
 * 		Object[] toArray();
 * 			调用这个方法可以把集合转换成数组
 * 		boolean contains(Object o);
 * 			判断集合中是否包含某个对象
 * 			包含返回true不适返回false
 * @author 王爸爸
 *
 */
public class Collection集合 {

	public static void main(String[] args) {
		
		 Collection c = new ArrayList();
		 
		 c.add(123);
		 c.add(1.23);
		 c.add(new Object());
		 c.add(true);
		 c.add(new cllectionn());
		 
		 System.out.println("集合中的元素个数是"+c.size());
		 
		 c.clear();
		 
		 System.out.println("集合中的元素个数是"+c.size());
		 
		 c.add("Hello world!");
		 c.add("how are you!");
		 c.add("I am you father!");
		 System.out.println(c.contains("how are you!") == true ? "包含":"不包含");
		 System.out.println(c.contains("ok") == true ? "包含":"不包含");
		 System.out.println("集合中的元素个数是"+c.size());
		 c.remove("I am you father");
		 System.out.println("集合中的元素个数是"+c.size());
		 
		 System.out.println(c.isEmpty() == true ? "元素个数为空":"元素个数不为空");
		 c.clear();
		 System.out.println(c.isEmpty() == true ? "元素个数为空":"元素个数不为空");
		 
		 c.add("math");
		 c.add("close");
		 c.add("tools");
		 c.add("replase");
		 c.add(12.16);
		 c.add(new cllectionn());
		 
		 Object[] object = c.toArray();
		 for (int i = 0; i < object.length; i++) {
			System.out.println(object[i]+"元素的下标："+i);
		}
		 
		 c.clear();
		 String s1 = new String("123");
		 c.add(s1);
		 String s2 = new String("456");
		 c.add(s2);
		 System.out.println("元素的个数是："+c.size());
		 String s3 = new String("123");
		 System.out.println(c.contains(s3));
	}

}
