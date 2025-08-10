package extends6constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识子类构造器特点，再看应用场景
        //子类构造器会先调用父类构造器，再调用子类构造器
        Zi zi = new Zi();
        System.out.println("==========");

    }
}

class Zi extends Fu {
    public Zi()
    {
        //super();//默认存在于子类中，写不写都有！！
        //super(666);//指定调用父类的有参构造器
        System.out.println("子类无参构造器");
    }
}


class Fu {
    public Fu()
    {
        System.out.println("父类无参构造器");
    }
}
