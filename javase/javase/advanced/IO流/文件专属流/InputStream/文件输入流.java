package javase.advanced.IO流.文件专属流.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream：
 * 		文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
 * 		字节的方式，完成输入的操作，完成读的操作。（硬盘-->内存）
 * @author Passerby
 *
 */
public class 文件输入流 {

	public static void main(String[] args) {

		/**
		 * 分析一下程序的缺点：
		 * 		一次读取一个字节byte，这样内存和硬盘交互的太频繁，
		 * 		时间和资源都浪费在交互上面了。
		 * 
		 * int read(byte[] b)
		 * 		一次最多读取b.length个字节。
		 * 		减少硬盘和内存的交互。
		 * 		往byte数组中读。
		 */
//		FileInputStream fis = null;
//		//创建文件字节输入对象
//		try {
//			//绝对路径
//			fis = new FileInputStream("D:\\eclipse\\MyWorkSpace\\my_project\\src\\priv\\xc\\my_project\\advanced\\IO流\\文件专属流\\temn");
//			
//			//开始读
////			int readDate = 0;
////			while (true) {
////				readDate = fis.read();//这个方法的返回值是读取到的字节本身
////				if (readDate == -1) {
////					break;
////				}
////				System.out.println(readDate);
////			}
//			
//			//改造while循环
//			int readDate = 0;
//			while ((readDate = fis.read()) != -1) {
//				System.out.println(readDate);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			//在finaliy语句块当中确保流一定关闭
//			if (fis != null) {
//				//关闭前提：流不适null
//				try {
//					fis.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		
		FileInputStream fis = null;
		try {
			//相对路径【相对路径一定是从当前所在的位置找】
			//项目My_project的根就是eclipse的起点默认当前路径。
			fis = new FileInputStream("D:\\\\eclipse\\\\MyWorkSpace\\\\\\\\my_project\\\\src\\\\priv\\\\xc\\\\my_project\\\\advanced\\\\IO流\\\\文件专属流\\\\temn");
			int read = 0;
			while ((read = fis.read()) != -1 ){
				System.out.println(read);
			}
		} catch (FileNotFoundException e) {
			//
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}		
	}//main()方法
}//文件输入流
