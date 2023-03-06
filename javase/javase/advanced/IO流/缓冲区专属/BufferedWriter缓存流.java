package javase.advanced.IO流.缓冲区专属;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * BufferedWriter:
 * 		带有缓冲的字符输出流
 * @author Passerby
 *
 */
public class BufferedWriter缓存流 {

	public static void main(String[] args) {

	
		BufferedWriter bw = null;
		try {
			/**
			 * BufferedWriter:包装流
			 * FileWriter:节点流
			 * 		bw = new BufferedWriter(new FileWriter("BufferedWriter",true));
			 * 
			 */
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("BufferedWriter",true)));
			bw.write("123");
			bw.write("\n");
			bw.write("789");
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
