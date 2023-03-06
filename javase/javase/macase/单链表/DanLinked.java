package javase.macase.单链表;

public class DanLinked {

	Node header = null;
	int count =0;
	
	public int size() {
		return count;
	}
	
	public void add(Object date) {
		if (null == header) {
			header = new Node(date,null);
		}else {
			/**
			 * 程序执行到此处
			 * 说明头结点已有
			 * 需找到末尾节点
			 */
			Node currentLastNode = FindLast(header);
			currentLastNode.next = new Node(date,null);
		}
		count++;
	}

	private Node FindLast(Node noxt) {
		if (null == noxt.next) {
			return noxt;
		}
		return FindLast(noxt.next);
	}
}
