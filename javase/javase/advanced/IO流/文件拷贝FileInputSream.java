package javase.advanced.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 文件拷贝FileInputSream {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//创建一个输入流对象
			fis = new FileInputStream("D:\\desjtop\\2021_1227_151828_436.MOV");
			//创建一个输出流对象
			fos = new FileOutputStream("D:\\123.MOV");
			byte[] bytes = new byte[1024 * 1024];//一次最多拷贝1MB
			int readCount = 0;
			
			long begin = System.currentTimeMillis();
			long end = System.currentTimeMillis();
			
			while((readCount = fis.read(bytes)) != -1) {
				fos.write(bytes,0,readCount);
			}
			System.out.println("拷贝文件耗费"+(end-begin)+"毫秒");
			//输出流最后要刷新
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
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
