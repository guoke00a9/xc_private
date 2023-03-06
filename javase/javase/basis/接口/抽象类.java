package javase.basis.接口;

public class 抽象类{
	public static void main(String[] args) {
		dog dog =new dog();
		dog.breathe();
		dog.run();
		dog.liveOnLand();
		
	}
}

interface Animal{
	String ANIMAL_BEHAVIOR="动物行为";
	void breathe();//呼吸
	void run();//跑步
}
//interface：接口
//LandAnimal"继承"Animal类
interface LandAnimal extends Animal{
	public static void chout() {
		System.out.println("这是接口2方法");
	}
}
//dog继承LandAnimal
class dog implements LandAnimal{
	
	public void breathe()
	{
		System.out.println(ANIMAL_BEHAVIOR+":狗在呼吸");
	}
	public void run()
	{
		System.out.println(ANIMAL_BEHAVIOR+":狗在奔跑");
	}
	public void liveOnLand()
	{
		System.out.println("狗是陆地上的动物");
	}
}

