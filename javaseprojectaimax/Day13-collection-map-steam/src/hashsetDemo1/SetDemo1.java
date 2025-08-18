package hashsetDemo1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //目标：认识Set家族集合的特点。
        //1.创造一个Set集合，特点：无序，不重复，无索引
        //Set<String> set = new HashSet<>();//HashSet集合，特点：无序，不重复，无索引
        Set<String> set = new LinkedHashSet<>();//LinkedHashSet集合，特点：有序，不重复，无索引
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("C++");
        set.add("C++");
        set.add("大数据");
        set.add("自媒体");
        System.out.println(set);

        //2.创建TreeSet集合:排序（默认一定按大小升序排序），不可重复，无索引。
        Set<Double> set1 = new TreeSet<>();
        set1.add(9.5);
        set1.add(9.1);
        set1.add(9.3);
        set1.add(9.2);
        System.out.println(set1);

        System.out.println("===================");

        String s1 = "acd";
        String s2 = "abc";

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.hashCode());



    }
}
