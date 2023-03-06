package javase.advanced.IO流.文件专属流.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * int available();
 * 		返回流当中剩余的没有读到的字节数量
 * long skip(long n);
 * 		跳过几个字节不读
 * @author Passerby
 *
 */
public class FileInputStream常永方法 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\eclipse\\MyWorkSpace\\my_project\\src\\priv\\xc\\my_project\\advanced\\IO流\\文件专属流\\temn");
			System.out.println("总字节数量"+fis.available());
			/**
			 * int available();
			 * 		返回流当中剩余的没有读到的字节数量
			 */	
			////读到一个字节
			////int readByte = fis.read();
			////还剩下几个字节
			////System.out.println("还剩下几个字节没读"+fis.available());
			////不需要循环，直接读一次就行
			//byte[] bytes = new byte[fis.available()];//这种方式不适合太大的文件，因为byte数组不能太大。
			//fis.read(bytes);
			//System.out.println(new String(bytes));
			
			/**
			 * long skip(long n);
			 * 		跳过几个字节不读
			 * 		以后有可能会用
			 */
			fis.skip(3);//97 98 99
			System.out.println(fis.read());
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
