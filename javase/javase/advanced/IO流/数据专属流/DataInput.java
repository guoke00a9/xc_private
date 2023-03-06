package javase.advanced.IO流.数据专属流;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * DataInputStream:
 * 		数据字节输入流。
 * 		DataOutputStream写的文件只能使用DataInputStream去读。
 * 		而且读的时候需要提前知道写入的顺序。
 * 		读的顺序和写的顺序一致，才可以正常读取。
 * @author Passerby
 *
 */
public class DataInput {

	public static void main(String[] args) {

		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("data"));
			byte b = dis.readByte();
			short s = dis.readShort();
			int i = dis.readInt();
			long l= dis.readLong();
			double d = dis.readDouble();
			float f = dis.readFloat();
			boolean sex = dis.readBoolean();
			char c = dis.readChar();
			
			System.out.println(b);
			System.out.println(s);
			System.out.println(s);
			System.out.println(i+1000);
			System.out.println(l);
			System.out.println(d);
			System.out.println(f);
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
