package extendstest;

public class People {
    //父类
    //继承：复用率提高了  减少了重复代码
    private String name;
    private  char  sex;

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
}
