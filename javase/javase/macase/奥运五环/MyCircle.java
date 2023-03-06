package javase.macase.奥运五环;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MyCircle {
	public static void main(String[] args) {
		Robot root = null;
		try {
			/**
			 * 创建静态数组Coordinate
			 * 数组名：
			 * 		cooarray
			 * 元素存放奥运五环的xy坐标点【为画⚪的起点】
			 */
			Coordinate[] cooarray = {new Coordinate(400, 300),new Coordinate(600, 300),new Coordinate(800, 300),new Coordinate(500, 425),new Coordinate(700, 425)};
			root = new Robot();//创建机器人对象
			root.delay(7000);//延迟7秒，留给用户时间打开画板并选择圆形
			for (int i = 0; i <5; i++) {//循环5次，依次读取每个⚪的起始坐标点
				int x = cooarray[i].getX();//获取第一个元素对象的x值
				int y = cooarray[i].getY();//获取第一个元素对象的y值
//				System.out.println(x);
//				System.out.println(y);
				for (int j = 0; j < 10; j++) {//循环10次，往往在鼠标移动时候，一些不可控的因素，导致移动失败，所以循环10次，避免失败，太多次会影响cpu执行效率
					root.mouseMove(x, y);//移动鼠标到xy坐标点
				}
				x += 250;//第一个⚪xy值自加
				y += 250;//指定⚪的大小
				root.mousePress(InputEvent.BUTTON1_MASK);//按下鼠标左键
				root.delay(500);//延迟0.5s用户可以看到绘画过程
				for (int k = 0; k < 10; k++) {//循环10次，往往在鼠标移动时候，一些不可控的因素，导致移动失败，所以循环10次，避免失败，太多次会影响cpu执行效率
					root.mouseMove(x, y);//鼠标移动到xy坐标点
				}
				root.mouseRelease(InputEvent.BUTTON1_MASK);//释放鼠标左键
				root.delay(1000);
				for (int l = 0; l < 10; l++) {//循环10次，往往在鼠标移动时候，一些不可控的因素，导致移动失败，所以循环10次，避免失败，太多次会影响cpu执行效率
					root.mouseMove(100, 300);//画完⚪之后，鼠标移动至⚪外边空白的地方
				}
				root.mousePress(InputEvent.BUTTON1_MASK);//按下鼠标左键
				root.mouseRelease(InputEvent.BUTTON1_MASK);//释放鼠标左键
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
