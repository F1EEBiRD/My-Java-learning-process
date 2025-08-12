package interface1;


public class Test {
    public static void main(String[] args) {
        //目标：认识接口，基础使用
        System.out.println(A.SCHOOL_NAME);
        //注意：接口不能创建对象
        C c = new C();
        c.run();
        System.out.println(c.go());
        c.Play();
    }


    }
    //C被称为实现类，同时实现了多个接口
//实现类实现了多个接口，必须重写完全部接口的全部抽象方法，否则这个类必须定义成抽象类（正常不会定义成这样）
class C implements B , A{
    @Override
    public void run() {

    }

    @Override
    public String go() {
        return "123321";
    }

    @Override
    public void Play() {
        System.out.println("C正在玩");

    }
}
