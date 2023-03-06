package javase.advanced.集合.cllection.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet：
 * 		是Set接口的实现类
 * 		集合存储的元素是无序且不重复的
 *		底层调用的是哈希表数据结构
 */

public class HashSet集合 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection set = new HashSet();
		set.add("德莱文");
		set.add("亚索");
		set.add("剑姬");
		set.add("永恩");
		set.add("剑姬");
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
		
	}

}
