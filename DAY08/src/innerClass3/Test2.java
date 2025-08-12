package innerClass3;

public class Test2 {
    public static void main(String[] args) {
        //目标：搞清楚匿名内部类的适用形式（语法）：通常可以作为一个对象参数传输给方法使用
        //需求：学生，老师都要参加游泳比赛
        Swim s1 = new Swim() {
            @Override
            public void swiming() {
                System.out.println("学生🏊‍贼快");
            }
        };
        start(s1);

        System.out.println("==================================");

        Swim s2 = new Swim() {
            @Override
            public void swiming() {
                System.out.println("老师🏊‍有用贼6");
            }
        };
        start(s2);

    }
    //设计一个方法，可以接受老师，和学生开始比赛
    public static void start(Swim s){
        System.out.println("开始比赛");
        s.swiming();
        System.out.println("比赛结束");
    }
}


/*class Teacher implements Swim{
    public void swiming(){
        System.out.println("老师🏊‍狗爬式游泳~~~");
    }
}



class Student implements Swim{
    public void swiming(){
        System.out.println("学生🏊‍蛙泳式游泳");
    }
}*/



interface  Swim{
    void swiming();//有用方法
}
