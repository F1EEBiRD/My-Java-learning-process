package interface1;

public interface A {
    //JDK8之前，接口只能定义常量和抽象方法
    //1.定义常量:接口中定义常量可以省略public static final不写，默认会加上去
    String SCHOOL_NAME = "黑马程序员";
    //public static final String SCHOOL = "黑马程序员";
    //2.抽象方法:接口中抽象方法可以省略public abstract不写，默认会加上去
    //public abstract void run();
    void run();
    String go();
}
