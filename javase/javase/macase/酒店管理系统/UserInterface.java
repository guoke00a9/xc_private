package javase.macase.酒店管理系统;
import java.util.Scanner;

public class UserInterface {
    public UserInterface(){
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店管理系统");
        System.out.println("功能编号对应的功能：1查看房间信息，2订房，3退房，0退出");
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("请输入功能编号：");
            int i = s.nextInt();
            if(i == 1){
                hotel.printRoom();
            }else if (i == 2){
                System.out.println("请输入房间号：");
                int x =s.nextInt();
                hotel.booking(x);
            }else if (i == 3) {
                System.out.println("请输入房间号：");
                int x =s.nextInt();
                hotel.checkOut(x);
            }else if (i == 0){
                return;
            }else{
                System.out.println("你输入的功能参数有误，请重新输入。");
            }
        }
    }
}
