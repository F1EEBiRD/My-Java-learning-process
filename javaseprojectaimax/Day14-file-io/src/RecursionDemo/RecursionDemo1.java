package RecursionDemo;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //认识递归
        printA();
    }

    private static void printA() {
        System.out.println("===已执行A===");
        printA();//直接递归，自己调用自己，会栈溢出
    }
}
