package javase.advanced.exception异常;

public class practice_异常_finally面试题 {

	public static void main(String[] args) {
		
		System.out.println(m());
	}
	/**
	 * java语法规则（有一些规则是不能破坏的，一旦说了，就必须这么做。）
	 * 		java中有这样一条规则：
	 * 			方法体中的代码必须遵循自上而下顺序依次逐行执行（亘古不变的语法！）
	 * 		java中还有一条与法规则：
	 * 			return语句一旦执行，整个方法必须结束（亘古不变的语法！）
	 * @return 100
	 */
	public static int m() {
		int i = 100;
		try {
			return i;
		} finally {
			i++;
		}
	}

}
