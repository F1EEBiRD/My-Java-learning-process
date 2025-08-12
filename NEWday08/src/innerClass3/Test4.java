package innerClass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        //目标：完成给数组排序，理解其中匿名内部类的用法。
        //准备一个学生类型的数组，存放6个学生对象
        Student[] students = new Student[6];
        students[0] = new Student("王德法", 18, 170, '男');
        students[1] = new Student("章鱼哥", 19, 160, '男');
        students[2] = new Student("海绵宝宝", 17, 160, '男');
        students[3] = new Student("谢老板", 18, 170, '男');
        students[4] = new Student("赵德柱", 19, 160, '男');
        students[5] = new Student("小钱", 17, 160, '男');

        //需求：按照年龄升序排序。可以调用sun公司写好的API直接对数组进行排序
        //  public static <T> void sort(T[] a, Comparator<? super T> c)
        //   参数一：需要排序的数组
        //   参数二：需要给sort声明一个 Comparator接口比较器对象（指定排序的规则）
        //  sort方法会调用匿名内对象的compare方法进行排序（对数组内的学生对象进行凉凉比较，从而实现排序。
        Arrays.sort(students, new Comparator<Student>() {//<new Comparator比较器 比较student>
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序规则：
                //如果你认为左边对象 大于 右边对象 那么就返回正整数
                //如果你认为左边对象 小于 右边对象 那么就返回负整数
                //如果两边相等，返回0
 /*               if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                }
                return 0;*/
                //return o1.getAge() - o2.getAge();//按照年龄升序！
                return o2.getAge() - o1.getAge();//按照年龄降序！
            }
        });


        //遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }

    }
}
