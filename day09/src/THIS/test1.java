package THIS;

public class test1 {
    //this是一个变量，用在方法中，用于拿到当前对象
    //哪个对象调用这个方法，this就拿到哪个对象
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.print();
        System.out.println(s1);

        System.out.println("=================");

        Student s2 = new Student();
        s2.print();
        System.out.println(s2);
    }
}
