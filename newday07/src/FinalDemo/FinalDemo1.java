package FinalDemo;

public class FinalDemo1 {
    //final 修饰静态成员变量
    //final修饰静态变量，这个变量今后被成为常量，可以记住一个固定值，并且不可改变，通常作为系统的配置信息
    public static final String schoolName = "黑马程序员";

    //final 修饰实例变量(一般没意义）
    public final String name = "王伟伟";
    public static void main(String[] args) {
        //目标：认识 final关键词作用
        //3. final修饰变量，变量有且仅能被赋值一次。
        /*
        变量有那些？
        A:成员变量:
        1.实例成员变量
        2.静态成员变量

        B:局部变量
        * */
        final double rate = 3.14;//被赋值一次
       // rate = 3.16;//第二次就不能被赋值了

        buy(0.8);//第一次




    }

    public static void buy(final double z) {//尝试做一个固定的折扣
        //z = 0.1; //第二次，不能被赋值了
        System.out.println(z);

    }
}

//1. final修饰类，类不能被继承
final  class  A{}
//class B extends A {}

//2.final修饰方法，方法不能被重写
class C{
    public final void show(){
        System.out.println("C.show方法被执行了");
    }
}
class D extends C{
/*
    @Override//不能重写上面的final修饰的方法
    public void show() {
        System.out.println("D.show方法被执行了");
    }
*/
}
