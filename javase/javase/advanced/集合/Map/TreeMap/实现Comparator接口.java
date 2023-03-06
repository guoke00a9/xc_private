package javase.advanced.集合.Map.TreeMap;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet:
 * 		放到TrreSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
 * 			第一种：放到集合中的元素实现java.lang.Comparable接口。
 * 			第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器对象。
 * 		Comparable和Comparator怎么选择？
 * 			如果比较规则轻易不会发生改变，或者说比较规则只有一个的时候，建议使现Comparable接口。
 * 			如果比较规则有多个，并且需要多个比较规之间频繁切换，建议使用Comparator接口。
 * 			Comparator的设计符合OCP原则。
 * @author Passerby
 *
 */
public class 实现Comparator接口 {

	public static void main(String[] args) {
		
		//比较器实现java.util.Comparator接口。（Comparable是java.lang包下的）
		TreeSet<WuGui> tswg = new TreeSet<>(new Comparator<WuGui>() {

			@Override
			public int compare(WuGui o1, WuGui o2) {
				return o1.age-o2.age;
			}
		});
		
		tswg.add(new WuGui(1000));
		tswg.add(new WuGui(800));
		tswg.add(new WuGui(1200));
		
		for (WuGui wuGui : tswg) {
			System.out.println(wuGui);
		}
	}

}

class WuGui{
	
	int age;
	
	public WuGui(int age) {
		this.age=age;
	}

	@Override
	public String toString() {
		return "乌龟 [age=" + age + "]";
	}
}