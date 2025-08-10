package homework;

public class Teacher {
    //请定义教师类（Teacher），属性包括姓名和工号，定义教课（teach）方法，输出“工号为xxx的xxx老师正在讲课”。
    //在测试类中，要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXxx赋值，有参创建的对象直接赋值。创建对象之后，调用对象中的teach()方法
    private String name;
    private String id;


    public Teacher() {
    }

    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void teach()
    {
        System.out.println("工号为"+id+"的"+name+"老师正在讲课");
    }
}


