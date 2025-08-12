package abstractDemo;

public class Test1 {
    public static void main(String[] args) {
    //目标：认识抽象类，抽象方法，搞清楚特点
    //抽象类的核心特点：有得有失（得到了抽象方法的能力，失去了创造对象的能力）
    //抽象类不能创建对象（重点）
    //A a = new A();//报错了：抽象类不能创建对象
    //抽象类的使命就是被子类继承，就是为了生孩子，抽象类不能实例化
        B  b = new B();
        b.setName("张三");

    }
}
