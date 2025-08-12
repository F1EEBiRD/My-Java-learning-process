package Method1reference;

import Method1reference.Student;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //目标：静态方法引用，演示一个场景
        //目标：实例方法应用，演示一个场景
        Test();


    }
    public static void Test() {
        Student[] students = new Student[6];
        students[0] = new Student("王德法", 18, 170, '男');
        students[1] = new Student("章鱼哥", 19, 160, '男');
        students[2] = new Student("海绵宝宝", 17, 160, '男');
        students[3] = new Student("谢老板", 18, 170, '男');
        students[4] = new Student("赵德柱", 19, 160, '男');
        students[5] = new Student("小钱", 17, 160, '男');

        //简化↓↓↓↓↓

        //Arrays.sort(students, (o1,  o2) -> o1.getAge() - o2.getAge());

        //Arrays.sort(students, (o1,  o2) -> Student.compareByAge(o1, o2));
        //静态方法引用 类名：：静态方法
        //前提：—> 前后参数的类型一致，才可以使用静态方法引用
        //Arrays.sort(students, Student::compareByAge);

        //实例方法引用 对象名：：实例方法 要先创建对象
        //前提：—> 前后参数的类型一致，才可以使用实例方法引用
        Student t = new Student();
        Arrays.sort(students, t::compareByHeight);


        //遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
