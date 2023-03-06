public class 王延超 {

    private static String name = "雪雯爸爸";
    public void likeEat(String name){
        System.out.println("我叫"+name+"我喜欢吃火锅！");
    }

    public static void main(String[] args) {
        new 雪雯().likeEat(name);
    }

}

class 雪雯 extends 王延超{
    private String name = "雪雯";
    @Override
    public void likeEat(String name) {
        super.likeEat(name);
    }
}
