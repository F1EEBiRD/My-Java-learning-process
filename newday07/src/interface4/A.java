package interface4;

import java.security.PrivateKey;

public interface A {
    //1.默认方法（普通实例方法）：必须加默认修饰符default
    //默认会用public修饰(可以不写）
    //如何调用？使用接口的实现类的对象来调用
    public default  void go(){
        System.out.println("go方法执行了");
    }

    //2.私有方法（JDK 9开始才支持的）
    //私有的实例方法。
    //如何调用？使用接口中的其他实例方法来调用它
    private void run(){
        System.out.println("run方法执行了");
    }

    //3.静态方法
    //默认会用public修饰
    //如何调用？只能使用当前接口名来调用。
    static void show(){
        System.out.println("show方法执行了");
    }


}


