package javase.advanced.多线程.定时器;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer定时器 {

	public static void main(String[] args) {

		//创建定时器对象
		Timer timer = new Timer(); 
		//Timer timer = new Timer(true);//守护线程的方式
		
		/**
		 * 指定定时任务
		 * timer.schedule(定时任务, 第一次执行时间，间隔多久执行一次);
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date firstTime = sdf.parse("2022-01-27 05:10:40");
			timer.schedule(new LogTimerTask(),firstTime, 1000 * 10);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
/**
 * 编写一个定时任务类
 * 假设这是一个记录日志的定时任务
 * @author Passerby
 *
 */
class LogTimerTask extends TimerTask{
	public void run() {
		//每隔10秒备份一次数据
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strTime = sdf.format(new Date());
		System.out.println(strTime+"完成一次备份");
	}
	
}
