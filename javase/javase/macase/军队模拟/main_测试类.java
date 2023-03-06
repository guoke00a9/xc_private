package javase.macase.军队模拟;

public class main_测试类 {

	public static void main(String[] args) {
		
		//创建军队武器数量
		Army army = new Army(4);
		
		//创建武器
		zhandouji zdj = new zhandouji();
		zhuangjiache zjc = new zhuangjiache();
		gaoshepao gsp = new gaoshepao();
		tanke tk1 = new tanke();
		tanke tk2 = new tanke();
		
		//添加武器
		
		try {
//			army.addWeapon(new zhandouji());
//			army.addWeapon(new zhuangjiache());
//			army.addWeapon(new gaoshepao());
//			army.addWeapon(new tanke());
			//army.addWeapon(new tanke());
			army.addWeapon(zdj);
			army.addWeapon(zjc);
			army.addWeapon(gsp);
			army.addWeapon(tk1);
		} catch (AddWeaponException e) {
			System.out.println(e.getMessage());
		}
		
		//所有可攻击武器攻击
		army.attackAll();
		
		//所有可移动武器移动
		army.moveAll();
	}

}
