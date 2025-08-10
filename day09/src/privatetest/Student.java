package privatetest;

public class Student {
    String name;
    private int age;
    private  double chinese;
    private double math;

    //2.如何合法暴露（合理暴露），使用public修饰（公开）的get和set方法合理暴露
    //成员的取值和赋值
    public void setAge(int age) {//为年龄赋值}
        if(age > 0 && age <= 120)
        {
            this.age = age  ;
        }
        else
        {
            System.out.println("输入的参数有误");
        }
    }
    public int getAge() {//获取年龄
        return age;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }
}
