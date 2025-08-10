package extends3demo;
import extends2demo.Fu;
public class Demo {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //其他包中只有公开的可以访问到
        fu.publicMethod();
        //fu.method();
        //fu.protectedMethod();
        //fu.privateMethod();

    }
}
