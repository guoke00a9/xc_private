package javase.advanced.多线程.线程sleep;

/**
 * sleep:
 * 		静态方法:Thread(100000);
 * 		参数是毫秒
 * 		作用:让当前线程进入休眠，进入“阻塞状态”，放弃占有CPU时间片，让给其它线程使用。
 * @author Passerby
 *
 */
public class 线程的sleep {

	public static void main(String[] args) {

		//让当前线程进入休眠，睡眠5秒
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main over!");
	}

}
