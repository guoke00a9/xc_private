package javase.advanced.集合.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class 遍历Map集合 {

	public static void main(String[] args) {

		//创建Map集合
		Map<Integer, String> map = new HashMap<>();
		//想Map集合中添加键值对
				
		map.put(1, "德莱文");//1在这里进行了自动装箱
		map.put(2, "疾风剑豪");
		map.put(3, "永恩");
		
		/**
		 * 遍历Map集合
		 * 		第一种：
		 * 			获取所有的key，所有的key是一个Set集合
		 * 			遍历key，通过key获取value
		 * 			使用foreach也是可以
		 * 		第二种：
		 * 			Set<Map.Entry<K,V>>entrySet()
		 * 			以上这种方式是把Map集合直接全部转换成Set集合
		 */
		//第一种：迭代器
		Set<Integer> key = map.keySet();
		Iterator<Integer> it = key.iterator();
		while (it.hasNext()) {
			Integer keys = it.next();
			//System.out.println(map.get(keys));
			String value = map.get(keys);
			System.out.println(keys+"="+value);
		}
		System.out.println("************************************");
		
		//第二种：迭代器
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		//遍历Set集合，每一次取出一个Node
		Iterator<Map.Entry<Integer, String>> it1 = set.iterator();
		while (it1.hasNext()) {
			Map.Entry<Integer, String> node = it1.next();
			System.out.println(node.getKey()+"="+node.getValue());
		}
		System.out.println("************************************");
		//使用foreach
		for(Map.Entry<Integer,String> node : set){
			System.out.println(node.getKey()+"="+node.getValue());	
		}
	}

}
