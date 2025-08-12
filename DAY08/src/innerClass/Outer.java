package innerClass;
//外部类
public class Outer {
    public static String schoollName = "黑马";
    public static void test(){
        System.out.println("test...");
    }
    private int age;

    public void run(){
        System.out.println("run...");
    }


    // 成员内部类:无static修饰，属于外部类的对象持有的
    public class Inner extends  Object{
        private String name;
        //构造器
        public Inner(){
            System.out.println("Inner()...");
        }
        //有参构造器
        public Inner(String name){
            this.name = name;
            System.out.println("Inner(String name)...");
        }



        public void show(){
            System.out.println("show...");
            //成员内部类中可以直接访问外部类的静态成员，也可以直接访问外部类的实例成员
            System.out.println(schoollName);
            test();
            //也可以直接访问外部类的实例变量
            System.out.println(age);
            run();
            System.out.println(this);
            System.out.println(Outer.this);
            
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
