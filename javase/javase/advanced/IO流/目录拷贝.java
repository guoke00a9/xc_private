package javase.advanced.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 目录拷贝 {

	public static void main(String[] args) {

		//拷贝源
		File srcFile = new File("E:\\java基础\\java基础案例教程\\06_《Java基础案例教程》\\源代码\\第7章 IO");
		//拷贝目标
		File destFile = new File("C:\\");
		//拷贝方法
		coprDir(srcFile,destFile);
	}
	/**
	 * 拷贝目录方法
	 * @param srcFile	拷贝源
	 * @param destFile	拷贝目标
	 */
	private static void coprDir(File srcFile, File destFile) {
		if (srcFile.isFile()) {
			FileInputStream in = null;
			FileOutputStream out = null;
			try {
				in = new FileInputStream(srcFile);
				String path = (destFile.getAbsolutePath().endsWith("\\") ?destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\") +srcFile.getAbsolutePath().substring(3);
				out = new FileOutputStream(path);
				byte[] bytes = new byte[1024 * 1024];
				int readCount = 0;
				while ((readCount = in.read(bytes)) != -1) {
					out.write(bytes,0,readCount);
				}
				out.flush();
			} catch (Exception e) {
			}finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (out == null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return;
		}
		File[] files = srcFile.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				String srcDir = file.getAbsolutePath();
				String desrDir = (destFile.getAbsolutePath().endsWith("\\") ?destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\") +srcDir.substring(3);
				File newfFile = new File(desrDir);
				if (!newfFile.exists()) {
					newfFile.mkdirs();
				}
			}
			coprDir(file,destFile);
		}
	}

}
