package javase.advanced.string字符串;

public class string {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/**
		 * 判断大小
		 */
		int result = "abc".compareTo("abc");
		System.out.println(result);//0（相等）
		int result2 = "abc".compareTo("abd");
		System.out.println(result2);//-1（小于）
		int result3 = "abd".compareTo("abc");
		System.out.println(result3);//1（大于）
		/**
		 * 判断是否包含字符串
		 */
		System.out.println("sadxxxz".contains("xxx"));
		/**
		 * 判断是否以某个字符串开始
		 */
		System.out.println("http://www.baidu.com".startsWith("http"));
		/**
		 * 判断是否以某个字符串结尾
		 */
		System.out.println("Admin.java".endsWith("java"));
		/**
		 * 将字符串转成bate数组
		 */
		byte[] bytes = "abcd".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		/**
		 * 判断某个字符串在当前字符串中第一次出现的索引
		 */
		System.out.println("sdfjsgfksdgfbdkj".indexOf("df"));
		/**
		 * 判断某个字符串是否为空
		 */
		String string = "sss";
		System.out.println(string.isEmpty());
		/**
		 * 判断某个字符串在当前字符串中最后一次出现的索引
		 */
		System.out.println("akgdajhdgahak".lastIndexOf("ak"));
		/**
		 * 字符串截取
		 */
		System.out.println("http://www.baidu.com".substring(7));
		System.out.println("http://www.baidu.com".substring(7, 10));//左闭右开
		/**
		 * 字符串替换
		 */
		String newString = "http://www.baidu.com".replace("http://", "https://");
		System.out.println(newString);
		String newString1 = "asdasda=asdas=asd=fghhf".replace("=", ".");
		System.out.println(newString1);
		/**
		 * 字符串拆分
		 */
		String[] arra = "1999-11-12".split("-");
		for(int i=0;i<arra.length;i++) {
			System.out.println(arra[i]);
		}
		/**
		 * 获取单个字符
		 */
		char aaa = "王杰".charAt(0);
		System.out.println(aaa);
		/**
		 * 将字符串转换成char数组
		 */
		char[] chars = "我是中国人".toCharArray();
		for(int i=0;i<chars.length;i++) {
			System.out.println(chars[i]);
		}
		/**
		 * 转换小写
		 */
		System.out.println("SADADsasdASDADS".toLowerCase());
		/**
		 * 转换大写
		 */
		System.out.println("SADADsasdASDADS".toUpperCase());
		/**
		 * 去除字符串前后空白
		 */
		System.out.println("  aj   dg       ".trim());
		/**
		 * 将非字符串转换成字符串
		 */
		System.out.println(String.valueOf(true));
	}

}
