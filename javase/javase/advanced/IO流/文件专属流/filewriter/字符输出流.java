package javase.advanced.IO流.文件专属流.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter:
 * 		文件字符输出流
 * 		只能输出普通文本
 * @author Passerby
 *
 */
public class 字符输出流 {

	public static void main(String[] args) {

		FileWriter out = null;
		try {
			out = new FileWriter("myFile",true);
			
			char[] chars = {'德','莱','文'};
			out.write(chars);
			out.write("我是一名java软件工程师！");
			out.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (out == null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
