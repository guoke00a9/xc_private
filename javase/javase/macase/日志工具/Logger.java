package javase.macase.日志工具;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * 日志工具
 * @author Passerby
 *
 */
public class Logger {
	/**
	 * 记录日志的方法
	 * @param record
	 */
	public static void log(String record) {
		try {
			PrintStream out = new PrintStream(new FileOutputStream("log.txt",true));
			System.setOut(out);
			Date nowTime = new Date(0);
			SimpleDateFormat sdf = new SimpleDateFormat("hhhh-MM-dd HH:mm:ss SSS");
			String strTime = sdf.format(nowTime);
			System.out.println(strTime+"发生了"+record);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
