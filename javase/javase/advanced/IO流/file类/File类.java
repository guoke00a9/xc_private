package javase.advanced.IO流.file类;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * File:
 * 		File类和四大家族没有关系，所以File类不能完成文件的读和写。
 * 		File对象代表文件和路径名的抽象表示形式。
 * 		一个File对象有可能对应的是目录，也可能是文件。
 * 		
 * 		需要掌握File类中常用的方法:
 * 			
 * @author Passerby
 *
 */
public class File类 {

	public static void main(String[] args) {

		//创建一个File对象
		//File file1 = new File("D:\\file\\file");
		File file1 = new File("file");
		//判断是否存在
		System.out.println(file1.exists());
		//如果D:\\file不存在，则以文件的形式创建出来
//		if (!file1.exists()) {
//			try {
				//以文件的形式创建
//				file1.createNewFile();
//			} catch (IOException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
//		}
		//如果D:\\file不存在，则以目录的形式创建出来
		if(!file1.exists()) {
			//以目录的形式创建
			file1.mkdir();
		}
		/*************************************************************/
		//创建多重目录
		File file2 = new File("D:\\file\\a\\b\\c\\d");
		System.out.println(file2.exists());
		if (!file2.exists()) {
			//以多重目录形式新建
			file2.mkdirs();
		}
		/*************************************************************/
		//获取该文件的父路径
		File file3 = new File("D:\\eclipse\\MyWorkSpace\\my_project\\src\\priv\\xc\\my_project\\macase\\货物运输系统\\Gps.java");
		String parentPath = file3.getParent();
		System.out.println(parentPath);
		File parentFile = file3.getParentFile();
		System.out.println("获取绝对路径:"+parentFile.getAbsolutePath());
		/*************************************************************/
		File file4 = new File("计算机英语");
		System.out.println("绝对路径:"+file4.getAbsolutePath());
		/*************************************************************/
		File file5 = new File("D:\\SofCnKiller\\SoftCnKiller2.62\\弹窗定位.exe");
		System.out.println("获取文件名"+file5.getName());
		//判断是否是一个目录
		System.out.println(file5.isDirectory());
		//判断是否是一个文件
		System.out.println(file5.isFile());
		//获取文件最后一次修改时间
		long haoMiao = file5.lastModified();//这个毫秒是1970年到现在的总毫秒数
		//将总毫秒转换成日期
		Date time =new Date(haoMiao);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strTime = sdf.format(time);
		System.out.println(strTime);
		//获取文件大小
		System.out.println(file5.length()+"字节");
		/*************************************************************/
		//获取当前目录下的所有子文件
		File file6 = new File("D:\\eclipse\\MyWorkSpace\\my_project");
		File[] files = file6.listFiles();
		for (File file : files) {
			//System.out.println(file);
			System.err.println(file.getName());
		}
	}

}
