package javase.advanced.IO流.转换流专属;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class 字节流转换字符流BufferedReader {

	public static void main(String[] args) {

		//字节流
		BufferedReader br = null;
		try {
			/**
			 * in = new FileInputStream("English");
			 * 这个构造方法只能穿一个字符流，不能传字节流
			 * br = new BufferedReader(in);
			 */
			//通过转换流
			/*
			in = new FileInputStream("Eenlish");//节点流
			isr = new InputStreamReader(in);//节点流转换字符流
			br = new BufferedReader(isr);//包装流
			*/
			
			//写法优化
			br = new BufferedReader(new InputStreamReader(new FileInputStream("English")));
			
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (Exception e) {
			// TODO: handle exception
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
