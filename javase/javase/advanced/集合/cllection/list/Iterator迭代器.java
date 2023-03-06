package javase.advanced.集合.cllection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javase.advanced.集合.cllection.cllectionn;

/**
 * 迭代器：【*****】
 * 		遍历方式/迭代方式，是所有Collection通用的一种方式。
 * 		在任何Map集合中不能用，在所有的Collection以及子类中能用。
 * @author 王爸爸
 *	Iterator:
 *		boolean hasNext()如果仍有元素可以迭代，返回true。
 *		Object next()返回迭代的下一个元素。
 */
public class Iterator迭代器 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		Collection list = new ArrayList();
		/**
		 * 此时的迭代器，指向的是集合中没有元素状态下的迭代器。
		 * 几何结构只要发生改变，迭代器必须重新获取。
		 * 
		 */
		//Iterator it = list.iterator();
		list.add("亚索");
		list.add("德莱文");
		list.add("永恩");
		list.add(new cllectionn());
		//对集合Collection进行遍历/迭代
		//获取集合对象的迭代器对象Ineratar
		Iterator it = list.iterator();
		//通过以上获取的迭代器对象开始迭代/遍历集合
		while(it.hasNext()) {
			/**
			 * 不管存进去什么，取出来同意都是Object。
			 */
			Object object = it.next();
			System.out.println(object);
		}
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			Object object = it.next();
			if("亚索".equals(object)) {
				it.remove();
			}
		}	
		
		System.out.println(list.size());
	}
}
