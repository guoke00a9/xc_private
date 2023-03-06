package javase.macase.精华平台;


import javase.util.RU;

public class 精华平台 {

	private int x;
	private int y;
	private int ms;
	private int forInex;
	private int yulanx;
	private int yulany;
	private int guanbix;
	private int guanbiy;
	private int wheel;
	private int shipinx;
	private int shipiny;
	private int rollerSpacing;
	private int number;
	
	public 精华平台() {}

	/**
	 *
	 * @param x 第一个课件x坐标
	 * @param y 第一个课件y坐标
	 * @param ms 课件观看时间
	 * @param forInex 课件数量/7
	 * @param yulanx 预览课件x坐标
	 * @param yulany 预览课件y坐标
	 * @param guanbix 关闭课件x坐标
	 * @param guanbiy 关闭课件y坐标
	 * @param shipinx 视频x坐标
	 * @param shipiny 视频y坐标
	 * @param wheel 鼠标滚轮次数
	 * @param rollerSpacing 课件之间间距
	 * @param number 每页课件数量
	 */
	public 精华平台(int x, int y, int ms, int forInex, int yulanx, int yulany,
			int guanbix, int guanbiy, int shipinx, int shipiny, int wheel, 
			int rollerSpacing, int number) {
		this.x = x;
		this.y = y;
		this.ms = ms;
		this.forInex = forInex;
		this.yulanx = yulanx;
		this.yulany = yulany;
		this.guanbix = guanbix;
		this.guanbiy = guanbiy;
		this.wheel = wheel;
		this.shipinx = shipinx;
		this.shipiny = shipiny;
		this.rollerSpacing = rollerSpacing;
		this.number = number;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}

	public int getForInex() {
		return forInex;
	}
	public void setForInex(int forInex) {
		this.forInex = forInex;
	}

	public int getYulanx() {
		return yulanx;
	}
	public void setYulanx(int yulanx) {
		this.yulanx = yulanx;
	}

	public int getYulany() {
		return yulany;
	}
	public void setYulany(int yulany) {
		this.yulany = yulany;
	}

	public int getGuanbix() {
		return guanbix;
	}
	public void setGuanbix(int guanbix) {
		this.guanbix = guanbix;
	}

	public int getGuanbiy() {
		return guanbiy;
	}
	public void setGuanbiy(int guanbiy) {
		this.guanbiy = guanbiy;
	}

	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getShipinx() {
		return shipinx;
	}
	public void setShipinx(int shipinx) {
		this.shipinx = shipinx;
	}

	public int getShipiny() {
		return shipiny;
	}
	public void setShipiny(int shipiny) {
		this.shipiny = shipiny;
	}

	//1350,120,1000,2,1350,960,1640,80,10
	public void begin(){
		int ys=0;
		
		for (int i=forInex; i>0; i--){
			 ys= y;
			RU.mouseMove(x, ys);//全部章节
			for (int j=0; j< number;j++){

				RU.delay(200);//由于代码运行速度过快，延迟0.2s
				RU.mouseClick();//单击鼠标打开课件
				RU.delay(200);//由于代码运行速度过快，延迟0.2s

				RU.mouseMove(yulanx, yulany);//移动到预览课件
				RU.mouseDClick();//双击鼠标预览课件
				RU.delay(200);//由于代码运行速度过快，延迟0.2s
				RU.mouseMove(shipinx,shipiny);//移动到视频播放
				RU.mouseClick();//单机播放视频

				RU.delay(ms);//课件观看ms
				RU.mouseMove(guanbix, guanbiy);//移动到关闭预览
				RU.mouseClick();//单击鼠标关闭预览
				RU.delay(200);//由于代码运行速度过快，延迟0.2s

				ys += rollerSpacing;
				RU.mouseMove(x, ys);//全部章节
			}
			RU.mouseMove(x,y);
			RU.delay(1000);
			RU.mouseWheel(wheel);
		}
	}
}