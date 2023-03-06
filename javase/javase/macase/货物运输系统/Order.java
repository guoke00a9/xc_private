package javase.macase.货物运输系统;

//定义订单类
public class Order {
	{
		System.out.println("订单开始处理，仓库验货中---");
	}
	//订单编号
	private String id;
	//货物重量
	private double goodsWeight;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	public Order(String id,double goodsWeight) {
		this.setId(id);
		this.setGoodsWeight(goodsWeight);
	} 
	//无参构造--默认
	public Order(String goodskg) {
		super();//可省略
	}
	//订单状态方法
	public String OrderInformation(String number,String model,String admin) {
		System.out.println("货物重量："+this.getGoodsWeight()+"KG");
		this.OrderStadeStart(number,model,admin);
		System.out.println("快递单号："+this.getId());
		return "";
	}
	SpecialTransportation special = new SpecialTransportation();
	
	public void OrderStadeStart(String number,String model,String admin){
		System.out.println("货物检验完毕！");
		System.out.println("货物填装完毕！");
		System.out.println("运输人已通知！");
		System.out.println("---------------------------------");
		special.SpecialTransportation(number, model, admin);
		MobilePhone m = new MobilePhone();
		m.coordinate();
	}
	public void OrderStadeEnd(String number,String model,String admin) {
		System.err.println("---------------------------------");
		System.out.println("运输任务已完成！");
		special.End(number, model, admin);
		special.maintain();
	}
	
	
	
}
