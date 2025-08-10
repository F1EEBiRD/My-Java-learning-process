package statictest;

public class Student {
    //静态变量：有static修饰，属于类，只加载一份，可以被类和类的全部对象访问
    static String name;

    //实例变量：没有static修饰，属于对象，每个对象有自己一份
    int age;
}
