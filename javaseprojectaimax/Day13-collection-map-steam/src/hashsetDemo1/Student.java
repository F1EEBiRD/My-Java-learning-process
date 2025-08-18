package hashsetDemo1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String adress;
    private String phone;

    public Student() {
    }

    public Student(String name, int age, String adress, String phone) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //只要两个对象内容一样 结果一定是true.
    //s3.equals(s4)// true

    @Override
    public boolean equals(Object o) {
        //1.如果自己和自己比较 直接返回true
        if (this == o) return true;
        //2.如果o 是null 或者 不是同一个对象（当前是Student），返回false
        if (o == null || getClass() != o.getClass()) return false;
        //3.向下转型
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(adress, student.adress) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        //保证了不同学生对象，如果内容一样 返回的哈希值一定是一样的。
        return Objects.hash(name, age, adress, phone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                '}' + "\n";
    }
}
