package javase.advanced.time日期;


import java.text.SimpleDateFormat;
import java.util.Date;

public class 日期 {
	public static void main(String[] args) throws Exception{
		//系统当前时间(精确到毫秒)
		Date time = new Date();
		System.out.println(time);
		
		/**
		 * SimpleDateFormat:
		 * 		这个类专门负责日期格式化
		 * 		将日期类型Date 按照指定格式进行转换
		 * 		new SimpleDateFormat(需要指定日期格式);
		 * 				字母		表示
		 * 				y			年
		 * 				M			月
		 * 				w			周（年）
		 * 				W			周（月）
		 * 				D			天（年）
		 * 				d			天（月）
		 * 				F			星期
		 * 				H			小时（天）0-23
		 * 				k			小时（天）1-24
		 * 				K			小时（天）1-11
		 * 				m			分钟（小时）
		 * 				s			秒（分钟）
		 * 				S			毫秒
		 */
		SimpleDateFormat time1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println(time1.format(time));
		
		/**
		 * 日期字符串转换Date类型
		 *  new SimpleDateFormat("格式不能随便写，要和字符串格式一致");
		 *  2001.12.16 12：00
		 */
		String time2 = "2001.12.16 20:01";
		SimpleDateFormat time3 = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		Date time4 = time3.parse(time2);
		System.out.println(time4);
		
	}
}
