package polymorphsm1;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态的代码形式
        //1.对象多态，行为多态，变量名不谈多态
        Animal a1 = new rabbit();
        a1.run();//编译看左边（animal大类），运行看右边（具体小类a1）
        System.out.println(a1.name);//成员变量：编译看左边，运行也看左边

        Animal a2 = new Tortoise();
        a2.run();
        System.out.println(a2.name);
    }
}
