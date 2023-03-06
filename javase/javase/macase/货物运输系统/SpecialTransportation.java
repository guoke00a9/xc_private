package javase.macase.货物运输系统;

//专用运输类
//继承交通工具类并且实现保养接口
public class SpecialTransportation extends Transportation implements Maintain{
	
	public SpecialTransportation() {
		super();
	}
	public void SpecialTransportation(String number,String model,String admin) {
		this.setNumber(number);
		this.setModel(model);
		this.setAdmin(admin);
		this.Freight();
	}
	public void Freight() {
		System.out.println("运输人"+this.getNumber()+"正在驾驶编号为"+this.getModel()+"的"+this.getAdmin()+"发送货物！");
	}
	public void End(String number,String model,String admin){
		System.out.println("运输人"+this.getNumber()+"所驾驶编号为"+this.getModel()+"的"+this.getAdmin()+"已归还！");
	}
	@Override
	public void maintain() {
			System.out.println("货运车辆保养完毕！");
	}
	
}
