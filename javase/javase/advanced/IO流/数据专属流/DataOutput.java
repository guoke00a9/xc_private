package javase.advanced.IO流.数据专属流;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream:
 * 		这是个数据专属的流。
 * 		这个流可以将数据连同数据的类型一并写入文件。
 * 		注意：这个文件不是普通文本文件。
 * @author Passerby
 *
 */
public class DataOutput {

	public static void main(String[] args) {
		
		DataOutputStream dos = null;
		try {
			//创建一个数据专属的字节输出流
			dos = new DataOutputStream(new FileOutputStream("data"));//这里需要传一个OutputStream，由于是抽象类，所以传子类FileOutputStream
			//写数据
			byte b = 100;
			short s = 200;
			int i = 300;
			long l = 400L;
			double d = 3.14;
			float f = 3.0F;
			boolean sex = false;
			char c = 'a';
			
			dos.writeByte(b);
			dos.writeShort(s);
			dos.writeInt(i);
			dos.writeLong(l);
			dos.writeDouble(d);
			dos.writeFloat(f);
			dos.writeBoolean(sex);
			dos.writeChar(c);
			
			dos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
