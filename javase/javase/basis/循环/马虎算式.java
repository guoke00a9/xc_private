package javase.basis.循环;

public class 马虎算式 {

	public static void main(String[] args) {
		int count = 0;
		int counts = 0;
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				for(int c=1; c<10; c++) {
					for(int d=1;d<10;d++) {
						for(int e=1;e<10;e++) {
							if(a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d !=e) {
								 count ++;
								 if ((a*10+b)*(c*100+d*10+e)==(a*100+d*10+b)*(c*10+e) ) {
									counts++;
								}
								}
						}
					}
					
				}
			}
		}
		System.out.println("1-9排列组合共有"+count+"个五位数");
		System.out.println("共有"+counts+"个数相等");
	}

}
