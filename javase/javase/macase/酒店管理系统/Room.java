package javase.macase.酒店管理系统;

/**
 * 房间类
 */
public class Room {

    private int no;
    private String type;
    private boolean state;
    public Room() {
    }
    public Room(int no, String type, boolean state) {
        this.no = no;
        this.type = type;
        this.state = state;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean getState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    public boolean equals(Object o) {
        if (o == null||(o instanceof Room)) return false;
        if (this == o) return true;
        //程序可以执行到此处 证明对象不相等 对象也不为空 有属于Room类型
        Room r = (Room)o;
        return this.getNo()==r.getNo();
    }
    public String toString() {
        return "[" + no +"," + type + ","+(state?"占用":"空闲")+"]";
    }
}
