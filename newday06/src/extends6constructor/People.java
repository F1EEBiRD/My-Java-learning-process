package extends6constructor;

public class People {
    //父类
    //继承：复用率提高了  减少了重复代码
    private String name;
    private  char  sex;
    private  int age;

    public People() {
    }

    public People(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {return age;}
}
