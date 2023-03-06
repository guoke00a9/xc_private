package javase.advanced.IO流.标准输出流专属;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream:
 * 		标准的字节输出流，默认输出到控制台。
 * @author Passerby
 *
 */
public class 标准输出流PrintStream {

	public static void main(String[] args) {

		//联合起来写
		System.out.println("瑞雯");
		
		PrintStream ps = System.out;
		ps.println("德莱文");
		ps.println("疾风剑豪");
		ps.println("永恩");
		
		//标准输出流不需要手动close()关闭。
		
		/**
		 * System:
		 * 		System.gc();建议启动垃圾清理器
		 * 		System.currentTillis();获取1970年1月1日 00：00：00 000到当前日期的毫秒数
		 * 		System.setOut();
		 * 		System.exit();退出JVM虚拟机
		 * 		System.arraycopy();数组拷贝
		 */
		
		/**
		 * 该变标准输出流的输出方向
		 * 
		 */
		
		try {
			//标准输出流不在指向控制台，指向“log”文件。
			PrintStream prints = new PrintStream(new FileOutputStream("log"));
			//修改输出方向，将输出方向修改到“log”文件；
			System.setOut(prints);
			//输出
			System.out.println("德莱文");
			System.out.println("疾风剑豪");
			System.out.println("无极剑圣");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
