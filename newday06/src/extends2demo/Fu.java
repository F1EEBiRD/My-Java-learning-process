package extends2demo;

public class Fu {
    private void privateMethod()
    {//只能本类中，同一个包也访问不了（私有化）
        System.out.println("privateMethod()");
    }

    void method()
    {//只能在本类 同一个包中的类访问（缺省：定义变量没有给赋值）
        System.out.println("method()");
    }

    protected void protectedMethod()
    {//本类，同一个包中的类，子类子孙类中访问
        System.out.println("protectedMethod()");
    }

    public void publicMethod()
    {//本类，同一个包中的类，子类，其他包中的类（公开的 任意位置都可以访问）
        Fu fu = new Fu();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
        fu.privateMethod();
    }
}
