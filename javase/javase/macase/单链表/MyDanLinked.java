package javase.macase.单链表;

public class MyDanLinked {

	public static void main(String[] args) {
		
		DanLinked dl = new DanLinked();
		
		dl.add(2001);
		dl.add(12);
		dl.add(16);
		dl.add(new MyDanLinked());
		System.out.println(dl.count);
	}

}
