package javase.advanced.object超类;

/*			******非重点******
 * JDK9之后已经被抛弃了 过时了 目前主流JDK8
 * 
 * java中的垃圾回收期不是轻易启动的
 * 垃圾太少或者时间未到，种种条件下
 * 有可能启动，也有可能不启动。
 * @author 王爸爸
 * 				
 */
public class Object_fanalize {
	public static void main(String[] args) {
	
		Animall animall = new Animall();
		
		//怎么把对象变成垃圾？
		animall = null;
		
		/**
		 * 建议垃圾回收器启动
		 * 也有可能不启动
		 * 启动的概率变高
		 */
		System.gc();
	}
}
/**
 * 项目开发中有一种需求，所有对象在JVM中被释放的时候记录一下释放时间；
 * 记录对象被释放的时间点，这个负责记录的代码写到finalize()方法中
 * @author 王爸爸
 *
 */
class Animall{
	
	/**
	 * 重写finalize方法
	 * Animal类型的对象被垃回收器回收的时候，垃圾回收区负责调用finaliz()方法
	 */
	protected void finalize()throws Throwable{
		System.out.println("即将被销毁");
	}
}
