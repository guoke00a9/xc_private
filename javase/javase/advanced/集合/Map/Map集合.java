package javase.advanced.集合.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Map:
 * 		V PUT(K key,V value);
 * 			向集合中添加键值对
 * 		void clear();
 * 			清空Map集合
 * 		boolean containKey(Object key);
 * 			判断Map中是否包含某个key
 * 		boolean containsValue(Object value);
 * 			判断Map中是否包含某个vlaue
 * 		V get(Object key);
 * 			通过key获取value
 * 		boolean isEmty();
 * 			判断Map集合中的个数是否为0
 * 		Set<K> keySet();
 * 			获取Map集合中所有的key
 * 		V remove(Object key);
 * 			通过key删除键值对
 * 		int size();
 * 			获取Map集合中键值对的个数
 * 		Cllection<V> values();
 * 			获取Map集合中所有的value，返回一个Cllection
 * 		Set<Map.Entry<K,V>>entrySet();
 * 			将Map集合转换成Set集合
 * 
 */
public class Map集合 {

	public static void main(String[] args) {

		//创建Map集合
		Map<Integer, String> map = new HashMap<>();
		//想Map集合中添加键值对
		
		map.put(1, "德莱文");//1在这里进行了自动装箱
		map.put(2, "疾风剑豪");
		map.put(3, "永恩");
		
		//通过key获取value
		String value = map.get(2);
		System.out.println(value);
		
		//获取键值对的数量
		int x = map.size();
		System.out.println(x);
		
		//通过key删除value
		map.remove(1);
		System.out.println(map.size());
		
		//判断是否包含某个key
		//contanis底层调用的是equals方法，所以自定义的类型需要重写equals
		System.out.println(map.containsKey(4));//false
		
		//盘判断是否包含某个value
		System.out.println(map.containsValue("疾风剑豪"));//true
		
		//获取所有的value
		Collection<String> value1 = map.values();
		for(String s : value1) {
			System.out.println(s);
		}
		
		//获取所有的key返回一个Map集合
		Set<Integer> key1 = map.keySet();
		
		//清楚map集合
		map.clear();
		System.out.println(map.size());
		
		//判断map集合是否为空
		System.out.println(map.isEmpty());
	}

}
