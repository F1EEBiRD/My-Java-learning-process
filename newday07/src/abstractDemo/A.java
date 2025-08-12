package abstractDemo;

public abstract class  A {
    // 抽象方法:必须用abstract修饰，抽象方法有方法体，但抽象方法不能被调用，
    private String name;
    private int age;

    public A(){
        System.out.println("无参构造方法");
    }

    public A(String name,int age){

        this.name = name;
        this.age = age;
    }

    public abstract void show();

    public void show1(){
        System.out.println("a类中的show方法");
    }


    public String getName() {
        return name;
    }

    public Void setName(String name) {
        this.name = name;
        return null;
    }

    public int getAge() {
        return age;
    }


}

