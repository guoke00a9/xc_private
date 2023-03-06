package javase.advanced.IO流.对专属流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 
 * @author Passerby
 *
 */
public class ObjectInput反序列化 {
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("seriaLize"));
			//开始反序列化
			Object object = ois.readObject();
			System.out.println(object);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (ois == null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
