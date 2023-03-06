package javase.advanced.IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 文件拷贝{

	public static void main(String[] args) {

		FileReader inp = null;
		FileWriter out = null;
		
		try {
			inp = new FileReader("D:\\eclipse\\MyWorkSpace\\my_project\\src\\priv\\xc\\my_project\\计算机英语");
			out = new FileWriter("English");
			char[] chars =new char[1025 * 512];
			int readCount = 0;
			while((readCount = inp.read(chars)) != -1) {
				out.write(chars,0,readCount);
			}
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (out == null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (inp == null) {
				try {
					inp.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
