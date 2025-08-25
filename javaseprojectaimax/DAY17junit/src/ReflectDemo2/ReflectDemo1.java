package ReflectDemo2;

public class ReflectDemo1 {
    public static void main(String[] args)  throws Exception{
        //目标:掌握反射第一步操作：获取类的class对象（类本身）
        //1.获取类本身：类.class
        Class c1 = Student.class ;
        System.out.println(c1);

        //2.获取类本身：对象.getClass()
        Student s1 = new Student();
        Class c2 = s1.getClass();
        System.out.println(c2);

        //3.获取类本身：Class.forName("类全路径")
        Class c3 = Class.forName("ReflectDemo2.Student");
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
