package javase.macase.模板设计模式;

public abstract class Penser {

	public void day() {
		qichuang();
		xishu();
		doSome();
		chifan();
	}
	
	public void qichuang() {
		System.out.println("起床");
	}
	
	public void xishu() {
		System.out.println("洗漱");
	}
	
	public abstract void doSome();
	
	public void chifan() {
		System.out.println("吃饭");
	}
}
