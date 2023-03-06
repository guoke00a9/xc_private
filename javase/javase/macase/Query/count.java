package javase.macase.Query;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class count {

	public static void main(String[] args) {

		Map<String, String> hs = new TreeMap<>();
		//Scanner s = new Scanner(System.in); 
		FileReader fr = null;
		File file = null;
		try {
			fr = new FileReader("物联2001.properties");
			Properties pro = new Properties();
			//调用load方法将流放到Properties数组当中，其中=左边做key，=右边做value。
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
			
			file = new File("D:\\desjtop\\物联2001简历");
			File[] files = file.listFiles();
//			Collection<String> value = hs.values();
			int j = 0;
			for (int i = 1; i < 47; i++) {
				if (i<10) {
					String name = hs.get("0"+i);
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
				else {
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
	
			
			
			
			
			
			
			
			
			
			
			
			
//			for (String string : value) {//王旭/范腾隆/许景涛/王佳怡/李兴丽/赵翼宇/王勇强/陶文学/余鑫鑫/范云翔/刘果慧/赵庆辉
//				System.out.println(string);
//			}
//			int i = 0;
//			for (String name : value) {//王旭/范腾隆/许景涛/王佳怡/李兴丽/赵翼宇/王勇强/陶文学/余鑫鑫/范云翔/刘果慧/赵庆辉
////				System.out.println(name);
//				for (; i < files.length;) {
//					if(!(files[i].getName().contains(name))) {
//						//System.out.println(files[0]);
//						System.out.println("未提交"+name);
//					}
//					i++;
//					break;
//					
//				}
//				
//			}
//			for (File file2 : files) {
//				/**
//				 * 王旭，王佳怡，李兴丽，赵翼宇，王勇强，陶文学，范云翔
//				 */
//				System.out.println(file2.getName());
//				for (String names : value) {
//					/**
//					 * 王旭，范腾龙，许景涛，王佳怡，李兴丽
//					 * 赵翼宇，王勇强，陶文学，余鑫鑫，范云翔
//					 */
//					System.out.println(names);
//					if (file2.getName().contains(names)) {
//						/**
//						 * T F F F T
//						 */
//						continue;
//					}else if (!(file2.getName().contains(names))) {
//						System.out.println(i+names+"未提交");
//						i++;
//						break;
//					}
//				}
//			}

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
