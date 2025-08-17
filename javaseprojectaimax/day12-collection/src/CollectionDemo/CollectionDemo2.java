package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //目标：搞清楚collection集合的整体作用
        Collection<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list); //[hello, world, java]


        //获取集合的元素个数
        System.out.println(list.size());

        //删除集合元素
        list.remove("hello");
        System.out.println(list);

        //判断集合是否为空
        System.out.println(list.isEmpty());

        //清空集合元素
        list.clear();

        //判断集合中是否存在某个数据
        System.out.println(list.contains("world"));

        //把集合转换成数组
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.toArray(String[]::new);

    }
}
