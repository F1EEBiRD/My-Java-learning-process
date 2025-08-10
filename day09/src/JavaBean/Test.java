package JavaBean;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚实体类是啥？搞清楚其基本作用和应用场景。
        //实体类的基本作用：创建它的对象，存取数据（封装数据）
        Student s1 = new Student();
        s1.setName("张三");
        s1.setChinese(90);
        s1.setMath(80);
        System.out.println(s1.getName() + " " + s1.getChinese() + " " + s1.getMath());
        Student s2 = new Student("李四", 100, 80);
        System.out.println(s2.getName() + " " + s2.getChinese() + " " + s2.getMath());
        //实体类在开发中的应用场景
        //创建一个学生的操作对象专门负责对学生对象的数据进行业务处理
        StudentService operator = new StudentService(s1);
        operator.printScore();
        operator.printAvgScroe();


    }
}
