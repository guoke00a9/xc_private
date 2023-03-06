package javase.macase.Query;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class NewCount {

	public static void main(String[] args) {

		Map<String, String> hs = new TreeMap<>();
		FileReader fr = null;
		File file = null;
		try {
			fr = new FileReader("物联2001.properties");
			Properties pro = new Properties();
			pro.load(fr);
			for (int i = 1; i < 48; i++) {
				if (i<10) {
					String is = "0"+String.valueOf(i);
					String name = pro.getProperty(is);
					hs.put(is, name);
				}else if (i>=10) {
					String name = pro.getProperty(String.valueOf(i));
					hs.put(String.valueOf(i), name);
				}
			}
			hs.put("58", "褚宇");

			file = new File("D:\\desjtop\\物联2001");
			File[] files = file.listFiles();
			int j = 0;
			for (int i = 1; i < 48; i++) {
				
				if (i<10) {
					String name = hs.get("0"+i);//王旭，范腾龙，许景涛					
					for (; j < files.length;) {
						if (i==2|i==9) break;
						if (!(files[j].getName().contains(name))) {
							System.out.println("未提交"+name);
							break;
						}else {
							j++;
							break;
						}
					}
				}
				else {
					if (i==43|i==42) break;
					String name = hs.get(String.valueOf(i));
					for (; j < files.length;) {
						if (!(files[j].getName().contains(name))) {
							System.out.println("未提交"+name);
							break;
						}else {
							j++;
							break;
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fr == null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

