package javase.macase.超市购物系统;

public class IO {

	public static void main(String[] args) {

       StringBuffer s = new StringBuffer();
       s.append("a,");
       s.append("c,");
       s.append("x");
       
       String s1String = new String(s);
       String[] c = s1String.split(",");
       for (String string : c) {
		System.out.println(string);
	}
       System.out.println(c[1]);
	}

}
