package javase.advanced.多线程下载;//package priv.xc.javase.advanced.多线程下载;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//
//import org.apache.commons.io.*;
//import org.checkerframework.checker.initialization.qual.Initialized;
//import org.checkerframework.checker.nullness.qual.NonNull;
//import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
//
//public class 多线程下载 {
//
//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//
//		
//	}
//
//}
//class WebDownloader{
//	public void downloader(String url,String name) {
//		try {
//			FileUtils.copyURLToFile(new URL(url),new File(name));
//		} catch (@UnknownKeyFor @NonNull @Initialized IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//	}
//}