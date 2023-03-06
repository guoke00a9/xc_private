package javase.advanced.集合.Map.Map.HachMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap集合：【HashSet】
 * 		非线程安全
 * 		HashMap集合底层是哈希表数据结构/散列表数据结构
 * 		哈希表是一个数组和单链表的结合体
 * 		放到HashMap集合key部分的元素其实就是放到了HashSet集合中了。
 * 		重点：所以HashSet集合中的元素也需要同时重写hashCode()+equals()方法。
 * 		HashMap集合的默认初始化容量是16，默认加载因子是0.75
 * 			这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容。
 *			重点：HashMap集合初始化容量初始化必须是2的倍数，这是官方推荐的。
 *			这是因为达到散列军营，为了提高HashMap集合的存储侠侣，所必需的。
 *		HashMap的key和value可以为null。
 */
public class HashMap集合 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap();
		map.put(111,"亚索");
		map.put(222,"德莱文");
		map.put(333,"永恩");
		map.put(222,"宫本武藏");//key重复value覆盖
		System.out.println(map.size());//3
		
		//遍历map集合
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for (Map.Entry<Integer, String> entry : set) {
			System.out.println(entry);
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

}
