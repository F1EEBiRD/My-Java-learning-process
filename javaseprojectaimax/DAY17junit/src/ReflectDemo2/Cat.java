package ReflectDemo2;

public class Cat {
    private String name;
    private int age;
    private String hobby;
    private Cat() {
        System.out.println("无参数构造器执行了~~");
    }
    private Cat(String name) {
        System.out.println("1个参数有参数构造器执行了~~");
        this.name = name;
    }
    public Cat(String name, int age) {
        System.out.println("2个参数有参数构造器执行了~~");
        this.name = name;
        this.age = age;
    }

    private void eat(){
        System.out.println("猫吃鱼！");
    }

    public String eat(String name){
        System.out.println("猫吃" + name);
        return "猫说：谢谢！谢谢！喵喵喵！";
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
