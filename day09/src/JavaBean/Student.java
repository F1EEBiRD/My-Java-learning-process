package JavaBean;
//实体类
public class Student {
    //1.私有成员变量
    private String name;
    private int chinese;//语文成绩
    private int math;//数学成绩

    //必须提供无参数构造器
    public Student() {
    }
    //提供一个有参数构造器（可选）
    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }


    //2.提供公开的getter和setter方法

}
