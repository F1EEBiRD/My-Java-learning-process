package code;

public class CodeDemo2 {
    public String name;
    public String[] direction = new String[4];//实例变量
    //目标：实例代码块，无static修饰，无参数，无返回值，无返回值，无异常，无this，无super。属于对象，每次创建对象时，都会优先执行一次
    //基本作用：初始化对象的实例资源
    {
        System.out.println( "==实例代码块执行了== ");
        name = "张三";
        direction[0] = "上";
        direction[1] = "下";
        direction[2] = "左";
        direction[3] = "右";

    }

    public static void main(String[] args) {
        System.out.println("======main方法执行了======");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
