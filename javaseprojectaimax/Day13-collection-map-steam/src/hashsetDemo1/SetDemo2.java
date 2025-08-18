package hashsetDemo1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        //目标：掌握HashSet的存储数据特点
        Student s1 = new Student("刘备", 20 , "北京", "12345678901");
        Student s2 = new Student("关羽", 19 , "上海", "12345678902");
        Student s3 = new Student("张飞", 18 , "广州", "12345678903");
        Student s4 = new Student("张飞", 18 , "广州", "12345678903");

        Set<Student> set = new HashSet<>();//不重复的，每个对象都是新对象 底层原理：哈希表
        //结论：如果希望set集合认为2个内容一样的对象是重复的，必须重写hashCode()和equals()方法
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);

    }
}
