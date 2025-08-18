package StreamDemo;

import javax.smartcardio.TerminalFactory;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //目标：掌握Stream流的统计，收集操作（终结方法）
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("金毛狮王", 53, 54000));
        teachers.add(new Teacher("张无忌", 18, 30500));
        teachers.add(new Teacher("张三丰", 60, 6000));
        teachers.add(new Teacher("王伟", 52, 5000));
        teachers.add(new Teacher("程坤", 52, 50030));

        teachers.stream().filter(t -> t.getSalary() > 15000).forEach(System.out::println);

        System.out.println("--------------------------------------");
        long count =teachers.stream().filter(t -> t.getSalary() > 15000).count();
        System.out.println(count);

        System.out.println("--------------------------------------");
        //防止对象为null，optional：可以获取对象，如果对象为null，则返回一 个空的optional对象
        //获取薪水最多的老师对象
        Optional<Teacher> max = teachers.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher maxTeacher = max.get();//获取optional对象中的对象
        System.out.println(maxTeacher);

        System.out.println("--------------------------------------");
        //获取薪水最少的老师对象
        Optional<Teacher> min = teachers.stream().min((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher minTeacher = min.get();//获取optional对象中的对象
        System.out.println(minTeacher);

        System.out.println("--------------------------------------");

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张小四");

        //收集到集合或者数组中
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        //收到List集合
        List<String> list1 = s1.collect(Collectors.toList());

        //收集到Set集合
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> set = s2.collect(Collectors.toSet());
        System.out.println(set);

        //收集到数组中
        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        Object[] array = s3.toArray();
        System.out.println("数组：" + Arrays.toString(array));

        System.out.println("-----------收集到Map集合-----------");

        //Stream<Teacher> s4 = teachers.stream().sorted((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        //收集到Map集合，键是老师名称，值是老师薪水
        //Map<String, Double> map = s4.collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);

    }
}
