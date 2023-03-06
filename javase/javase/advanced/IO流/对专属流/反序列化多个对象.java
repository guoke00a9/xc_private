package javase.advanced.IO流.对专属流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class 反序列化多个对象 {

	public static void main(String[] args) {

		ObjectInputStream in = null;
		try {
			in= new ObjectInputStream(new FileInputStream("序列化多个对象"));
			List<User> userList = (List<User>)in.readObject();
			for (User user : userList) {
				System.out.println(user);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (in == null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
