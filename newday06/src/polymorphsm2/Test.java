package polymorphsm2;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态的代码
        //1.多态的好处 1：右边对象解耦合的
        Animal a1 = new Tortoise();
        a1.run();
        //a1.shrinkHead();//报错：多态下不能调用子类独有功能，父类没有锁头功能

        rabbit r = new rabbit();
        go(r);

        Tortoise t = new Tortoise();
        go(t);
    }


    //宠物游戏：所有动物都可以送给这个方法开始跑步
    //2.多态的好处：父类类型的变量作为参数，可以接收一个子类对象
    public static void go(Animal a) {
        System.out.println("开始跑步");
        a.run();

    }
}
