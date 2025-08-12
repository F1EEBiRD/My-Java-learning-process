package innerClass3;

public class Test {
    public static void main(String[] args) {
        //目标：认识匿名内部类，搞清楚其基本作用
        //匿名内部类实际上是有名字的：外部类名称 + $ + 匿名内部类在源文件中的行号
        //匿名内部本质是一个子类，同时会例子构建一个子类对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("🐱猫是喵喵喵叫~~~~");
            }
        };
        a.cry();
    }
}
/*class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("🐱猫是喵喵喵叫~~~~");
    }
}*/
