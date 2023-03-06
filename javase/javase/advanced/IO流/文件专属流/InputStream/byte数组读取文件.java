package javase.advanced.IO流.文件专属流.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class byte数组读取文件 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		//优化程序
		try {
			fis = new FileInputStream("D:\\eclipse\\MyWorkSpace\\\\my_project\\src\\priv\\xc\\my_project\\advanced\\IO流\\文件专属流\\main");
			byte[] bytes = new byte[4];
			/*
			while(true) {
				int redaCount = fis.read(bytes);
				if (redaCount == -1) {
					break;
				}
				System.out.print(new String(bytes,0,redaCount));
			}
			*/
			//优化while
			int redaCount = 0;
			while((redaCount = fis.read(bytes)) != -1) {
				System.out.print(new String(bytes,0,redaCount));
			}
					
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if (fis != null) {
					fis.close();	
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
		
		/*
		try {
				//使用byte数组读，一次读取多个字节。最多读取“数组.length”个字节。
				byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节。
				//相对路径【相对路径一定是从当前所在的位置找】
				//项目My_project的根就是eclipse的起点默认当前路径。
				fis = new FileInputStream("D:\\\\eclipse\\\\MyWorkSpace\\\\my_project\\\\src\\\\priv\\\\xc\\\\my_project\\\\advanced\\\\IO流\\\\文件专属流\\\\temn");
				int readCountfis = fis.read(bytes);
				System.out.println(readCountfis);//4
				System.out.println(new String(bytes));//"asd "
				
				System.out.println("-------------------------------");
				readCountfis = fis.read(bytes);
				System.out.println(readCountfis);//4
				System.out.println(new String(bytes));//"asd "
				
				System.out.println("-------------------------------");
				readCountfis = fis.read(bytes);
				System.out.println(readCountfis);//2
				System.out.println(new String(bytes,0,readCountfis));//"asd "
				
				System.out.println("-------------------------------");
				readCountfis = fis.read(bytes);
				System.out.println(readCountfis);//-1
				System.out.println(new String(bytes,0,readCountfis));//"asd "
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		*/
	}//main()
}//类
