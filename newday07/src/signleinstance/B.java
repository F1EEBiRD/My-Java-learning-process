package signleinstance;

public class B {
    //懒汉式单例类
    //私有化静态变量
    private static B b;

    //私有化构造器
    private B(){

    }

    //提供静态返回对象：真正需要对象时才开始创建对象
    public static B getInstance(){
        if(b == null){
            //第一次拿对象时，会创建对象，给静态变量b赋值
            b = new B();
        }
        //第二次拿对象时，因为不等于null了，直接返回对象
        return b;
    }

}
