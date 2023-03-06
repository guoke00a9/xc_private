package javase.macase.货物运输系统;

/*
//定义车类
public class Vehicle {
	//车牌号
	private String chepaihao;
	//品牌
	private String brand;
}
*/
public abstract class Transportation{
	
	private String number;
	private String model;
	private String admin;
	
	public Transportation() {
		super();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public Transportation(String number,String model,String admin) {
		this.setNumber(number);
		this.setModel(model);
		this.setAdmin(admin);
	}
	public abstract void Freight();
}

