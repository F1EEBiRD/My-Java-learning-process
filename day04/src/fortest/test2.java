package fortest;

public class test2 {
    //1.因为需要重复执行某段代码，所以需要用循环
    //循环次数 5
    //开始条件 1
    //结束条件 5
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println("您已断线" + i + '次' );
        }
    }
}
