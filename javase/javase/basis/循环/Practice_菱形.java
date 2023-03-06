package javase.basis.循环;

public class Practice_菱形 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {// 控制行数
            for (int j = 1; j <= 10 - i; j++) {// 控制空格
                System.out.print(" ");
            }
            for (int z = 1; z <= 2 * i - 1; z++) {// 控制*
                if (z == 1 || z == 2 * i - 1) {// 打印第一个*和最后一个*，其余的输出空格
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 10; i > 0; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

