package javase.basis.判断;
import java.util.*;

@SuppressWarnings("unused")
public class Practice_swith {
	@SuppressWarnings("resource")
	public static void main(String[]args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("请输入周几：");
		String aaa=cin.next();
		switch(aaa)
		{
			case "周一":
				System.out.println("周一您在上语文课");
			break;
			case "周二":
				System.out.println("周二您在上数学课");
			break;
			case "周三":
				System.out.println("周三您在上英语课");
			break;
			case "周四":
				System.out.println("周四您在上化学课");
			break;
			case "周五":
				System.out.println("周五您在上历史课");
			break;
			case "周六":
				System.out.println("周六您在休息");
			break;
			case "周日":
				System.out.println("周天您在旅游");
			break;
			
			default:
				System.out.println("您的输入有误");
		}
	}

}
