package signleinstance;
//设计成单例设计模式
public class A {
    //饿汉式单例：拿对象时，对象早就创建好了
    //2.创建一个静态的成员变量，用于基本本类的一个唯一对象
    private static final A a = new A();



    //1.私有化构造器，确保单例类对外不能创造太多对象，单例才有可能
    private A(){

    }
    //3.提供一个静态方法，返回唯一对象
    public static A getInstance(){
        return a;
    }

}
