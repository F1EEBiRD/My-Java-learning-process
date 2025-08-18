package StreamDemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }
//比较规则：t2.compareTo(t1)
    //t2 == this 比较者
    //t1 == o 被比较者
    //规则1：如果你认为左边大于右边，请返回正整数
    //规则2：如果你认为左边小于右边，请返回负整数
    //规则3：如果认为左边等于右边，请返回0
    //默认升序排序
    @Override
    public int compareTo(Teacher o) {
        //按照年龄升序排序
        /*if (this.getAge() > o.getAge()) return 1;
        else if (this.getAge() < o.getAge()) return -1;
        return 1;*/
        //↑简化
        return this.getAge() - o.getAge();//升序
        //return o.getAge() - this.getAge();//降序
    }
}
