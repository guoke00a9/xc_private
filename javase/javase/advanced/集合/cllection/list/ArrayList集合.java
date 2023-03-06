package javase.advanced.集合.cllection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 迭代器：【*****】
 * 		遍历方式/迭代方式，是所有Collection通用的一种方式。
 * 		在任何Map集合中不能用，在所有的Collection以及子类中能用。
 * @author 王爸爸
 *	Iterator:
 *		boolean hasNext()如果仍有元素可以迭代，返回true。
 *		Object next()返回迭代的下一个元素。
 */
public class ArrayList集合 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		/**
		 * ArrayList集合：
		 * 		默认初始化是10【底层县创建了一个长度为0的数组，当天价一个元素的时候，初始化容量10】
		 * 		集合底层是一个Object[]数组
		 * 		指定初始化容量
		 * 			List list1 = new ArrayList(15);
		 * 		非线程安全
		 * 数组：
		 * 		优点：检索效率比较高
		 * 			每个元素占有空间大小相同，内存地址是连续的，知道首元素内存地址
		 * 			然后知道下标，通过数学表达式计算出元素的内存地址，所以检索效率最高。
		 * 		缺点：随机增删元素效率比较低，像末尾添加还是比较高的。
		 * 			扩容降低效率
		 * 			数组无法存储大数据量【很难找到一块巨大的连续的内存空间】
		 */
		//指定初始化容量20
		Collection c = new ArrayList(20);
		c.add(1);
		c.add(2);
		c.add(3);
		//通过构造方法就可以将HashSet集合转换成List集合
		List list2 = new ArrayList(c);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
//		Collection list = new ArrayList();
//		list.add("亚索");
//		list.add("德莱文");
//		list.add("永恩");
//		list.add(new 集合());
//		//对集合Collection进行遍历/迭代
//		//获取集合对象的迭代器对象Ineratar
//		Iterator it = list.iterator();
//		//通过以上获取的迭代器对象开始迭代/遍历集合
//		while(it.hasNext()) {
//			/**
//			 * 不管存进去什么，取出来同意都是Object。
//			 */
//			Object object = it.next();
//			System.out.println(object);
//		}
//		while(it.hasNext()) {
//			Object object = it.next();
//			if("亚索".equals(object)) {
//				it.remove();
//			}
//		}
//		System.out.println(list.toString());
//		System.out.println(list);
		
	}
}
