package javase.basis.面向对象.封装;

public class Date {
	private int year;
	private int monyh;
	private int day;
	
	public Date() {
		//this(2001,12,16);
		System.out.println("无参构造");
	}
	public Date(int year, int month, int day) {
		this.year=year;
		this.monyh=month;
		this.day=day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonyh() {
		return monyh;
	}
	public void setMonyh(int monyh) {
		this.monyh = monyh;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public void printf() {
		System.out.println(year+"年"+monyh+"月"+day+"日");
	}
}
