package interface2;

public class Test {
    public static void main(String[] args) {
        //目标：去理解Java设计接口的好处，用处。
        //可以使类更强大更全面（相当于加额外DLC)
        //接口弥补了类单继承的局限性，可以让类拥有更多角色，类的功能更强大
        People p = new Student();
        Driver d = new Student();//多态
        BoyFriend b = new Student();//多态

        // 接口可以实现面向接口编程，更利于解耦合
        Driver a = new Teacher();

        BoyFriend bf = new Teacher();

    }
}

interface Driver{}
interface BoyFriend{}

class People{}
class Student extends People implements Driver,BoyFriend{}

class Teacher implements Driver,BoyFriend{}
