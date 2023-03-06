package javase.basis.接口;

public class main_测试类 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c = new Computer();
		c.add(new Mouse());
		c.add(new Mic());
		c.add(new KeyBoard());
		c.powerOn();
		System.out.println();
		c.powerOff();
	}
}
