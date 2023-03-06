package javase.macase.酒店管理系统;
/**
 * 酒店类
 */
public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];
        for (int i=0;i<rooms.length;i++){   //i标识下标 i+1表示楼层
            for(int j=0;j<rooms[i].length;j++){//房间号通过i+和j得到
                if (i==0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",false);
                }else if (i==1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",false);
                }
                else if(i==2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",false);
                }
            }
        }
    }

    /**
     * 遍历酒店房间信息
     */
    public void printRoom(){
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 订房方法
     * 假设订209
     * 通过房间编号演算数组下标
     */
    public boolean booking(int x){
        //循环判断输入房间号是否正确
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                    if (rooms[i][j].getNo() == x){
                        Room room=rooms[x/100-1][x%100-1];
                        room.setState(true);
                        System.out.println(rooms[i][i].getNo()+"已定房");
                        return true;
                }
            }
        }
        System.out.println("你输入的房间号有误，请重新输入。");
        return false;
    }
    /**
     * 退房方法
     */
    public boolean checkOut(int x){
        //循环判断输入房间号是否正确
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                if (rooms[i][j].getNo() == x){
                    Room room=rooms[x/100-1][x%100-1];
                    room.setState(false);
                    System.out.println(rooms[i][i].getNo()+"已退房");
                    return false;
                }
            }
        }
        System.out.println("你输入的房间号有误，请重新输入。");
        return true;
    }
}
