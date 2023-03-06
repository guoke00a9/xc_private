package javase.macase.紫荆城巅峰对决.copy;

import java.util.Random;

public class Hero {
	 //英雄名字、血量、蓝亮、基础伤害下限、基础伤害上线、基础防御下限、基础防御上限
    private String name;
    private int HP;
    private int MP;
    private int BaseHurtLow;//伤害下限
    private int BaseHurtHigh;//伤害上限
    private int BaseDefenseLow;//防御下限
    private int BaseDefenseHigh;//防御下限
    private int BaseHurt;//攻击
    private int BaseDefense;//防御

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int gongji) {
		this.HP = HP-gongji;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public int getBaseHurtLow() {
		return BaseHurtLow;
	}
	public void setBaseHurtLow(int baseHurtLow) {
		BaseHurtLow = baseHurtLow;
	}
	public int getBaseHurtHigh() {
		return BaseHurtHigh;
	}
	public void setBaseHurtHigh(int baseHurtHigh) {
		BaseHurtHigh = baseHurtHigh;
	}
	public int getBaseDefenseLow() {
		return BaseDefenseLow;
	}
	public void setBaseDefenseLow(int baseDefenseLow) {
		BaseDefenseLow = baseDefenseLow;
	}
	public int getBaseDefenseHigh() {
		return BaseDefenseHigh;
	}
	public void setBaseDefenseHigh(int baseDefenseHigh) {
		BaseDefenseHigh = baseDefenseHigh;
	}
	public int getBaseHurt() {
		return BaseHurt;
	}
	public void setBaseHurt(int baseHurt) {
		BaseHurt = baseHurt;
	}
	public int getBaseDefense() {
		return BaseDefense;
	}
	public void setBaseDefense(int baseDefense) {
		BaseDefense = baseDefense;
	}
	public Hero(int BaseHurt, int BaseDefense)
    {
        //基础血量
        HP = 1000;
        //基础蓝量
        MP = 800;
        //基础伤害下限
        if (BaseHurt >= 100 & BaseHurt <= 300)
        {
            this.BaseHurt = BaseHurt;
        }
        if (BaseDefense > 0 & BaseDefense < 100)
        {
            this.BaseDefense = BaseDefense;
        }

    }

    int gongji;


    public int VipAttack()
    {
        Random ran = new Random();
        //int gongji = ran.nextInt(100)+1;
        int gongji = ran.nextInt(300)+1;
        return gongji;
    }
    public int Attack()
    {
        Random ran = new Random();
        //int gongji = ran.nextInt(100)+1;
        int gongji = ran.nextInt(50)+1;
        return gongji;
    }
    public void Defense()
    {
        int x = this.BaseHurt;
    }
}
