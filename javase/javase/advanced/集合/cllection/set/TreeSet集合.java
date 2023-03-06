package javase.advanced.集合.cllection.set;

import java.util.TreeSet;

/**
 * TreeSet：
 * 		集合存储的元素是无序且不重复的
 * 			这里的无序指的是存进去和取出来的不同 没有下标
 * 		存储的元素可以按照大小自动排序
 * 		称为可排序集合
 */
public class TreeSet集合 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		TreeSet ts = new TreeSet();
		ts.add("a");
		ts.add("c");
		ts.add("b");
		System.out.println(ts);
		
		TreeSet st1 = new TreeSet();
		st1.add(new Student("1","王杰"));
		st1.add(new Student("2","王烨"));
		st1.add(new Student("3","王声阳"));
		System.out.println(st1);
		
	}

}
class Student{
	private String idString;
	private String nameString;
	
	public Student(String idString,String nameString) {
		this.idString=idString;
		this.nameString=nameString;
	}

	@Override
	public String toString() {
		return idString+":"+nameString;
	}
	public int comparTo(Student o) {
		//return 0;//集合中只有一个元素
		//return 1;//集合按照怎么存就怎么取
		return -1;
	}
	
}
