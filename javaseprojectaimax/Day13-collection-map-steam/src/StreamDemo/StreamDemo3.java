package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    //目标：掌握stream提供的常用的中间方法，对流上的数据进行处理（返回新流，支持链式编程）
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张小四");

        //1.过滤方法
        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(System.out::println);
        //2.排序方法。
        List<Double> scores = new ArrayList<>();
        scores.add(99.9);
        scores.add(66.6);
        scores.add(77.7);
        scores.add(88.8);
        scores.add(88.8);

        scores.stream().sorted().forEach(System.out::println);//默认升序
        System.out.println("-------------------------");
        scores.stream().sorted((s1,s2) -> Double.compare(s2,s1)).forEach(System.out::println);//降序
        System.out.println("-------------------------");
        //降序只要前两名
        scores.stream().sorted((s1,s2) -> Double.compare(s2,s1)).limit(2).forEach(System.out::println);
        System.out.println("-------------------------");
        //跳过前两名
        scores.stream().sorted((s1,s2) -> Double.compare(s2,s1)).skip(2).forEach(System.out::println);
        System.out.println("-------------------------");
        //如果希望自动一堆小能够去重复，重写对象的hashCode()和equals()方法,才能去重
        scores.stream().sorted((s1,s2) -> Double.compare(s2,s1)).distinct().forEach(System.out::println);//去重
        System.out.println("-------------------------");
        //映射/加工方法：把流上原来的数据拿出来变成新数据又放到流上去。
        scores.stream().map(s -> "加10分后：" + (s+10)).forEach(System.out::println);
        System.out.println("-------------------------");
        //合并流：(每次只能合并两个)
        Stream<String> s1 = Stream.of("张三丰","张无忌","张翠山","张学友","张良");
        Stream<Integer> s2 = Stream.of(11,22,33,44,55);
        Stream<Object> s3 = Stream.concat(s1, s2);//因为两个流的数据类型不同，所以得用object合并
        System.out.println(s3.count());

    }
}
