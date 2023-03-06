package javase.macase.军队模拟;

/**
 * Army：军队
 * @author 王爸爸
 *
 */
public class Army {
	
	private Weapon[] weapons;
	
	public Army() {
		
	}
	/**
	 * 初始化数组【武器的数量】
	 * @param count
	 */
	public Army(int count) {
		weapons = new Weapon[count];
		
	}
	
	public void addWeapon(Weapon weapon) throws AddWeaponException {
		// TODO 自动生成的方法存根
		for (int i = 0; i < weapons.length; i++) {
			if(null == weapons[i]) {
				weapons[i] = weapon;
				return;
			}
		}
		//程序执行到此处证明weapon数组满了
		throw new AddWeaponException("武器数量达到上限！");
	}
	/**
	 * 可攻击的全部攻击
	 */
	public void attackAll() {
		// 遍历数组
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Shootable) {
				 Shootable shootable = (Shootable)weapons[i];
				 shootable.attack();
			}
		}
	}
	/**
	 * 可移动的全部移动
	 */
	public void moveAll() {
		//  遍历数组
		for (int i = 0; i < weapons.length; i++) {
			if (weapons[i] instanceof Moveable) {
				Moveable moveable = (Moveable)weapons[i];
				moveable.move();
			}
		}
	}
}
