package javase.advanced.time日期;

public class DatePractice {
	public static void main(String[] args) {

		/**
		 * 程序分析：
		 * 		获取1970年1月1日 00：00：00 000到当前日期的毫秒数
		 */
		
//		long nowTimeMillis = System.currentTimeMillis();
//		System.out.println(nowTimeMillis);
		long x = 1000000000;
		
		for(int i=0;i<11;i++) {
			long begin = System.currentTimeMillis();
			print(x);
			long end = System.currentTimeMillis();
			System.out.println("循环"+x+"次耗费"+(end-begin)+"毫秒");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	public static void print(long x) {
		for (int i = 0; i < x; i++) {
			//System.out.println(i);
		}
	}
}
