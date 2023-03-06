package javase.macase.紫荆城巅峰对决;

public class Battle {
	
	boolean X = true;
    int gongji;
    public void FightGo(Hero w, Hero h){
        while(true){
            if (X == true){
                if(h.getHP()>0){
                    gongji = w.VipAttack();
                    h.setHP(gongji);
                    System.out.println(h.getName() + "被" + w.getName() + "攻击，" + "伤害：" + this.gongji + ",血量剩余：" + h.getHP());
                    //kong(0);
                    
                    try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					
                    if (h.getHP()<0) {
                    	System.out.println(h.getName()+"已阵亡！！！");
                        break;
					}
                    X = false;
                }
            }else{
                if(w.getHP()>0){
                    gongji = h.Attack();
                    w.setHP(gongji);
                    System.out.println(w.getName() + "被" + h.getName() + "攻击，" + "伤害：" + this.gongji + ",血量剩余：" + w.getHP());
                    if(w.getHP()<0) {
                    	System.out.println(w.getName()+"已阵亡");
                    	break;
                    }
                    //kong(0);
                    
                    try {
						Thread.currentThread().sleep(500);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					
                    X = true;
                }
            }
        }
    }
    /*
    public static void kong(int x) {
    	for (int i = 0; i < 10000; i++) {
    		for (int j = 0; j < 10000; j++) {
				;
				;
				;
				;
				;
				;
				;
				;
			}
    	}
    }
    */
}