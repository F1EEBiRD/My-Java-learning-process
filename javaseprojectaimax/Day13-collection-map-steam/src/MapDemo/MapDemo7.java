package MapDemo;

import hashsetDemo1.Teacher;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo7 {
    public static void main(String[] args) {
        //目标：学习 TreeMap集合（原理和用法与TreeSet集合相同）
        Map<Teacher, String>  map= new TreeMap<>((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));//按薪水排，降序，这样就不会被覆盖
        map.put(new Teacher("吕不韦", 18, 5000.5), "462期");
        map.put(new Teacher("张三丰", 19, 6000.5), "422期");
        map.put(new Teacher("王老五", 17, 7000.5), "465期");
        map.put(new Teacher("伊老六", 18, 8000.5), "425期");
        System.out.println(map);

    }
}
