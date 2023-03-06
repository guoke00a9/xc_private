package javase.macase.奥运五环;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress类 {
	public static void main(String[] args) {

		try {
			InetAddress inetaddress = Inet4Address.getLocalHost();
			InetAddress remoteAddress = InetAddress.getByName("www.baidu.com");
			System.out.println("本机的IP地址："+inetaddress.getHostAddress());
			System.out.println("百度地址："+remoteAddress.getHostAddress());
			System.out.println("3秒是否可达："+inetaddress.isReachable(3000));
			System.out.println("百度的主机名为："+remoteAddress.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
