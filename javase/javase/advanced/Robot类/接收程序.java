package javase.advanced.Robot类;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class 接收程序 {

	public static void main(String[] args) {

		DatagramSocket ds = null;
		//定义一个字节数组，用于接收用户数据
		byte[] buf = new byte[1024];
		try {
			//定义一个DatagramSocket对象，监听的端口号为8954
			ds = new DatagramSocket(8959);
			//定义一个DatagramPacket对象，用于接受数据
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			System.out.println("等待接受数据");
			//等待接收数据，如果没有数据会阻塞
			ds.receive(dp);
			/**
			 * 调用DatagramPacket的方法获得接收到的信息
			 * 包括数据的内容、长度、发送的IP地址和端口号
			 */
			String str = new String(dp.getData(),0,dp.getLength())+"from"+dp.getAddress().getHostAddress()+":"+dp.getPort();
			//打印接受到的信息
			System.out.println(str);
			//释放资源
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (ds == null) {
				ds.close();
			}
		}
	}

}
