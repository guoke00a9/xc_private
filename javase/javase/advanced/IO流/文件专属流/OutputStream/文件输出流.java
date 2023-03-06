package javase.advanced.IO流.文件专属流.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream
 * 		文件字节输出流，负责写。
 * 		内存 --> 硬盘
 * @author Passerby
 *
 */
public class 文件输出流 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		try {
	
			byte[] bytes = {97,98,99,100,101,102};
			/**
			 * 这种方式谨慎使用，因为会将原文件的清空。
			 * 		fos = new FileOutputStream("myFile");【myFile文件不存在会根路径新建文件】
			 * 将byte数组全部写出
			 * 		fos.write(bytes);//abcdef
			 * 将byte数组的一部分写出
			 * 		fos.write(bytes,0,2);//ab
			 */

			/**
			 * 以追加得方式在文件末未写入，不会清空源文件。
			 */
			fos = new FileOutputStream("myFile",true);
			fos.write(bytes);
			byte[] bs = "我是一个中国人，我骄傲！".getBytes();
			fos.write(bs);
			//写完之后要刷新
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
