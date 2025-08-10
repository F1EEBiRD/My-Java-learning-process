package extends6constructor;

public class Test3 {
    public static void main(String[] args) {
        //目标：理解this（...)调用兄弟构造器
        //创建对象，存储一个学生的数据
        Student s1 = new Student("小王", 18, '男' );
        System.out.println(s1);

        Student s2 = new Student("小李", 19, '男',"清华");
        System.out.println(s2);

    }
}
