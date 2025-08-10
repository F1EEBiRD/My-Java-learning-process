package extendstest;

public class Test {
    public static void main(String[] args) {

    //目标：认识继承好处
    //1 创造对象，封装老师数据
    //子类可以继承父类的非私有成员
    //子类对象其实是由子类和父类多张设计图共同创建出来的
    Teacher t1 = new Teacher();
    t1.setName("小王");
    t1.setSex('男');
    t1.setSkill("java");
    System.out.println(t1.getName() + " " + t1.getSex() + " " + t1.getSkill());

    //2 创造对象，封装咨询师数据
    Consultant c1 = new Consultant();
    c1.setName("小李");
    c1.setSex('男');
    c1.setNumber("123456");
    System.out.println(c1.getName() + " " + c1.getSex() + " " + c1.getNumber());

}
}
