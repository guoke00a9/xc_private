package javase.macase.紫荆城巅峰对决;

public class main_巅峰对决 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Hero wangjie = new Hero(220, 80);
        wangjie.setName("常勇锦");//VIP
        Hero hanweichao = new Hero(295, 95);
        hanweichao.setName("李旭阳");//普通攻击
        Battle dadou = new Battle();
        dadou.FightGo(wangjie,hanweichao);
	}

}
