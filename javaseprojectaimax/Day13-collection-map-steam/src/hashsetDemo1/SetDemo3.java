package hashsetDemo1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        //目标：搞清楚TreeSet的排序规则。
        Set<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //return o2.getAge() - o1.getAge();//降序
                //return o1.getSalary() - o2.getSalary();//转不了因为 salary是double，所以要转成int
                return Double.compare( o1.getSalary(), o2.getSalary());//薪水升序

            }
        });//排序，无索引，不可重复
        //吕不韦和伊老六，年龄相同，所以伊老六如果返回1就是和吕不韦一样，返回-1就是和张三丰一样，返回0就是和王老五一样。
        ts.add(new Teacher("吕不韦", 18, 5000.5));
        ts.add(new Teacher("张三丰", 19, 6000.5));
        ts.add(new Teacher("王老五", 17, 7000.5));
        ts.add(new Teacher("伊老六", 18, 8000.5));
        System.out.println(ts);

        //结论：TreeSet默认不能给自定义对象排序，因为TreeSet底层是红黑树r，红黑树要求排序的元素必须实现Comparable接口
        //一定要继承Comparable接口，并实现compareTo方法，才能让TreeSet排序。


    }
}
