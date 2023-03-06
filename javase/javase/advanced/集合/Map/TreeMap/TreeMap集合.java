package javase.advanced.集合.Map.TreeMap;

import java.util.TreeSet;

/**
 * TreeSet：
 * 		底层是一个TreeMap
 * 		TreeMap底层是一个二叉树
 * 		放到TreeSet集合中的元素，等同于放到TreeMap集合的kay部分。
 * 		TreeSet集合中的元素，无序不可重复，但是可以按照元素的大小顺序自动排序。
 * 			俗称：可排序集合
 * @author Passerby
 *
 */
public class TreeMap集合 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		ts.add("德莱文");
		ts.add("亚索");
		ts.add("上官婉儿");
		
		for (String string : ts) {
			System.out.println(string);
		}
		
		TreeSet<Integer> tss = new TreeSet<>();
		tss.add(100);
		tss.add(500);
		tss.add(200);
		
		for (Integer i : tss) {
			System.out.println(i);
		}
	}

}
