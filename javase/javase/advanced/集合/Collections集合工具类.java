package javase.advanced.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.collection 集合接口
 * java.util.Collections 集合工具类
 * @author Passerby
 *
 */
public class Collections集合工具类 {

	public static void main(String[] args) {
		
		//ArrayList不适线程安全的
		List<String> list = new ArrayList<>();
		
		//变成线程安全的
		Collections.synchronizedList(list);
		
		list.add("aac");
		list.add("aae");
		list.add("aaa");
		list.add("aba");
		
		//排序
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		List<WuGui> wuGuis = new ArrayList<>();
		wuGuis.add(new WuGui(1000));
		wuGuis.add(new WuGui(800));
		wuGuis.add(new WuGui(2000));
		wuGuis.add(new WuGui(1500));
		for (WuGui wuGui : wuGuis) {
			System.out.println(wuGui);
		}
		//排序
		Collections.sort(wuGuis);
		for (WuGui wuGui : wuGuis) {
			System.out.println(wuGui);
		}
	}

}
class WuGui implements Comparable<WuGui>{
	
	int age;
	
	public WuGui(int age) {
		this.age=age;
	}

	public String toString() {
		return "乌龟 [age=" + age + "]";
	}

	public int compareTo(WuGui o) {
		return this.age-o.age;
	}

}