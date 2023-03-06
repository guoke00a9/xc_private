package javase.macase.超市购物系统;



class Market {
	private String marketName;//超市
	
	private Product[] productArr;//超市的仓库，里面有若干商品
	//set方法
	public String getMarketName() {
		return marketName;
	}
	//set方法
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	//get方法
	public Product[] getProductArr() {
		return productArr;
	}
	//set方法
	public void setProductArr(Product[] productArr) {
		this.productArr = productArr;
	}
	
	//卖货 指定商品名
	Product sell(String name) {
		//循环遍历仓库中每一个商品
		for(int i = 0;i<productArr.length;i++ ) {
			
			//如果商品名称和要买的一致
			if(productArr[i].getProName() == name) {
				
				return productArr[i];
			}
			
		}		
		return null;
	}
}
class Product{
	private String proName;//商品名字
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	
}
class Person{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Product shopping(Market market, String name) {
		return market.sell(name);
	}
}
