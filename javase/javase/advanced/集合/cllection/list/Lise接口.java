package javase.advanced.集合.cllection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List接口中常用的特有的方法：
 * 		void add(int index,Object element);
 * 			指定下标添加元素
 * 		Object get(int indes);
 * 			获取指定下标元素
 * 		int indesOf(Object o);
 * 			获取指定对象第一次出现处的索引
 * 		int LastIndexOf(Object o);
 * 			获取指定对象最后一次出现处的索引
 * 		Object remove(int index);
 * 			删除指定下标的元素
 * 		Object set(int index,Object element);
 */
public class Lise接口 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//在集合末尾元素
		list.add("a");
		list.add(1);
		list.add(new Vecyor集合());
		list.add(new Vecyor集合());
		//在指定下标添加指定元素
		list.add(1,"b");
		list.add("a");
		System.out.println("**************************************");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("**************************************");

		//通过下标取元素
		Object object = list.get(0);
		System.out.println(object);
		System.out.println("**************************************");

		/**
		 * List特殊的遍历方式：
		 * 		通过下标取元素
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("**************************************");

		//获取指定对象第一次出现处的索引
		System.out.println("1第一次出现的下标："+list.indexOf(1));//2
		System.out.println("**************************************");

		//获取指定对象最后一次出现的索引
		System.out.println("a最后一次出现"+list.lastIndexOf("a"));//5
		System.out.println("**************************************");

		//删除指定下标的元素
		list.remove(4);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("**************************************");
		
		//修改指定下标的元素
		list.set(1,"11111");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
