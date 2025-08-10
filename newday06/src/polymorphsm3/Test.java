package polymorphsm3;


public class Test {
    public static void main(String[] args) {
        //目标：认识多态的代码
        //1.多态的好处 1：右边对象解耦合的
        Animal a1 = new Tortoise();
        a1.run();
        //a1.shrinkHead();//报错：多态下不能调用子类独有功能，父类没有锁头功能

        // 强制类型转换：可以解决多台下调用子类独有功能，但是编译阶段不会报错
        Tortoise t1 = (Tortoise) a1;
        t1.shrinkHead();

        // 有继承关系就可以强制转换，编译阶段不会报错！
        //运行时可能会出现类型转换一场：ClassCastException
        //rabbit r1 = (rabbit) a1;

        System.out.println("------------------");

        rabbit r = new rabbit();
        go(r);

        Tortoise t = new Tortoise();
        go(t);
    }
    //宠物游戏：所有动物都可以送给这个方法开始跑步
    //2.多态的好处：父类类型的变量作为参数，可以接收一个子类对象
/*    public static void go(Animal a) {
        System.out.println("开始跑步");
        a.run();

    }*/
    public static void go(Animal a){
        System.out.println("开始!!!");
        a.run();//多态
        if (a instanceof rabbit) {//独有
            rabbit r1 = (rabbit) a;
            r1.cry();
        } else if (a instanceof Tortoise) {
            Tortoise t1 = (Tortoise) a;
            t1.run();
        }
        System.out.println("------------------");

        rabbit r = new rabbit();
        go(r);

        Tortoise t = new Tortoise();
        go(t);
    }
    }



