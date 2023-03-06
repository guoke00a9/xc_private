package javase.basis.接口;

class Mic implements USB{
	public void turnOn() {
		System.out.println("麦克风启动了!");
	}
	
	public void turnOff() {
		System.out.println("麦克风关闭了!");
	}
}
