package constructor;

public class TEST1 {
    public static void main(String[] args) {
        //目标：认识类的构造器，搞清楚其特点和常见应用场景。
        //构造器的特点：创建对象时，对象会立即自动调用构造器
        Student s1 = new Student();
        Student s2 = new Student("张三",18);

        System.out.println("==================");

        Student t1 = new Student();

        Student t2 = new Student("张三",18,'男');
        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.sex);

    }

}
