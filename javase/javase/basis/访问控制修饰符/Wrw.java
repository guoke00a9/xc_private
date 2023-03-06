package javase.basis.访问控制修饰符;

public class Wrw {

	public static void main(String[] args) {
		//父
		Q q = new Q();
		System.out.println(q.getX());
		//子
		W w = new W();
		w.setX(5);
		System.out.println(w.getX());
		Q qw = new W();
		System.out.println(qw.getX());
	}

}
class Q{
	public int x;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
class W extends Q{
	

}