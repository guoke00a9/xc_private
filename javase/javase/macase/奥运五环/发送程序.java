package javase.macase.奥运五环;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class 发送程序 {

	public static void main(String[] args) {

		DatagramSocket ds = null;
		try {
			//创建一个DatagramSocket对象
			ds = new DatagramSocket(3000);
			//要发送的数据
			Scanner input = new Scanner(System.in);
			String string = input.next();
			//将定义的字符转换为字节数据
			byte[] arr = string.getBytes();
			/**
			 * 创建一个要发送的数据包，数据包包括要发送的数据
			 * 数据的长度，接受端的IP地址以及端口号
			 */
			DatagramPacket dp = new DatagramPacket(arr, arr.length,InetAddress.getByName("localhost"),8959);
			System.out.println("发送消息!");
			ds.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
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
