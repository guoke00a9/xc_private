package javase.advanced.IO流.缓冲区专属;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader:
 * 		带有缓冲区的字符输入流。
 * 		不需要使用这个流的时候不需要自定义char数组或者byte数组。
 * @author Passerby
 *
 */
public class BufferedReader缓冲流 {

	public static void main(String[] args){

		/**
		 * 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
		 * 外部负责包装的这个流，叫做：包装流，还有一个名字叫做处理流。
		 * 像当前这个程序来说：FileReader就是一个节点流。BufferedReader就是一个包装流。
		 * 
		 * 对于包装刘来说只需要关闭外层流就行。里面的节点流会自动关关闭。
		 */
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("English");
			br = new BufferedReader(fr);
			
			String readLine = null;
			//br.readLine();这个方法读取一个文本行，但不带换行符。
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
