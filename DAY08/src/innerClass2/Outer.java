package innerClass2;
//外部类
public class Outer {
    //外部类的静态成员
    public static String schoolName;
    //外部类的实例成员
    private int age;
    //静态内部类：属于外部类本身持有
    public static class Inner{
        private String name;

        public void show(){
            //1.静态内部类中是否可以直接访问外部类的静态成员？可以！
            System.out.println(schoolName);
            //静态内部类中是否可以直接访问外部类的实例成员？不可以！
            //System.out.println(age);//报错！


        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
