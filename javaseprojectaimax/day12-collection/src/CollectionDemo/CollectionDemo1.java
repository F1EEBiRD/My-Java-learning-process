package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //目标 搞清楚collection集合的整体作用
        //1.list家族的集合：有序，可重复，有索引。
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("C++");
        System.out.println(list);//[hello world java C++] 顺序和添加顺序一致
        String rs = list.get(0);
        System.out.println(rs);

        //2.set家族的集合：无序，不可重复，无索引。
        Set<String> set = new HashSet<>();
        set.add("鸿蒙");
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("C++");
        System.out.println(set);



    }
}
