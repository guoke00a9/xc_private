package javase.basis.接口;

/**
 * 电脑开机
 */
/**
 * 创建并初始化了一个数组
 * 		类型：引用类型【父类型接口】
 * 		数组名：usbArr
 * 		长度：4
 * add方法：
 * 		1.调用add方法传入引用
 * 		2.循环写入数组数据
 * 		3.判断第一个下标是否为null【是否已写入数据】
 * 		4.若无数据则将第一个引用写入数组 若有数据则跳过继续判断下一个
 * @author 王爸爸
 */
public class Computer {
	private USB[] usbArr = new USB[4];
	public void add(USB usb) {
		for(int i=0;i<usbArr.length;i++)
		{
			if(usbArr[i] == null)
			{
				usbArr[i] = usb;
				break;
			}
		}
	}
	/**
	 * 开机方法
	 * 		遍历数组第一个元素是否为null
	 * 		不为null用父类型引用调用turnOn方法
	 */
	public void powerOn() {
		for(int i=0;i<usbArr.length;i++)
		{
			if(usbArr[i] != null)
			{
				usbArr[i].turnOn();
			}
		}
		System.out.println("计算机开机成功!");
	}
	/**
	 * 关机方法
	 * 		遍历数组第一个元素是否为null
	 * 		不为null用父类型引用调用turnOff方法
	 */
	public void powerOff() {
		for(int i=0;i<usbArr.length;i++)
		{
			if(usbArr[i] != null)
			{
				usbArr[i].turnOff();
			}
		}
		System.out.println("计算机关机成功!");
	}
}
