package StreamDemo;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //目标：获取Stream流的方式
        //1.获取集合的Steam流：调用集合提供的stream（）方法
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        //2.Map集合，怎么去那个Stream流呢？
        Map<String,Integer> map = new HashMap<>();
        //map.stream();
        //获取键流↓//keyset获取所有的键,快捷键var
        Stream<String> s2 = map.keySet().stream();
        //获取值流↓
        Stream<Integer> s3 = map.values().stream();
        //获取键值对流↓
        Stream<Map.Entry<String,Integer>> s4 = map.entrySet().stream();

        //3.获取数组的流
        String[] names = {"张三丰","张无忌","张翠山","张学友","张良"};
        Stream<String> s5 = Arrays.stream(names);
        System.out.println(s5.count());//5 记录 数

        Stream<String> s6 = Stream.of(names);
        //可变参数↓
        Stream<String> s7 = Stream.of("张三丰","张无忌","张翠山","张学友","张良");

    }
}
