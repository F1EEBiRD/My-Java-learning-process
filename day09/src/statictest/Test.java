package statictest;

public class Test {
    public static void main(String[] args) {
        //目标：认识static关键字，搞清楚static关键字的用法和特点。
        //1.类名.静态变量（推荐）
        Student.name = "张三";
        System.out.println(Student.name);

        //2.对象名 静态变量（不推荐）
        Student s1 = new Student();
        s1.name = "李四";

        Student s2 = new Student();
        s2.name = "王五";

        System.out.println(s1.name);
        System.out.println(Student.name);

        //3.对象名.实例变量
        s1.age = 23;
        s2.age = 18;
        System.out.println(s1.age);
        System.out.println(s2.age);

    }
}
