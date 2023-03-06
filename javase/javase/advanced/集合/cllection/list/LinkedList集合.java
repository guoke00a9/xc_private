package javase.advanced.集合.cllection.list;

import java.util.LinkedList;

/**
 * 链表数据结构
 * 		优点：随机增删效率较高（因为增删元素不涉及到大量元素位移）
 * 		缺点：查询效率较低，每一次查找某个元素的时候都需要从头节点开始往下遍历
 */
public class LinkedList集合 {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		link.add("王杰");
		link.add("王烨");
		link.add("王声阳");
		
		System.out.println(link.toString());
		link.add(2, "王延超");//插入下标2的位置
		System.out.println(link.toString());
		link.addFirst("aaa");//从集合第一个位置添加
		System.out.println(link.toString());
		link.addLast("fff");//从集合最后添加
		System.out.println(link.toString());//取出并打印该集合中的元素
		System.out.println(link);//打印集合
		System.out.println(link.getFirst());//取出并打印第一个元素
		System.out.println(link.getLast());//取出并打印最后一个元素
		link.remove(1);//删除集合中指定的元素
		System.out.println(link);
		link.removeFirst();//删除集合中第一个元素
		System.out.println(link);
		link.removeLast();//删除集合中最后一个元素
		System.out.println(link);

	}

}
