package javase.advanced.IO流.文件专属流.filereader;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader:
 * 		文件字符输入流，只能读取普通文本。
 * 		
 * @author Passerby
 *
 */
public class 文件字符输入流 {

	public static void main(String[] args) {

		FileReader fr = null;
		try {
			fr = new FileReader("D:\\eclipse\\MyWorkSpace\\my_project\\src\\priv\\xc\\my_project\\计算机英语");
			char[] chars = new char[10];
			int readCount;
			while((readCount = fr.read(chars)) != -1) {
				System.out.print(new String(chars,0,readCount));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
