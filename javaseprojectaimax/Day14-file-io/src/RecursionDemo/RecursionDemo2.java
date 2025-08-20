package RecursionDemo;

public class RecursionDemo2 {
    public static void main(String[] args) {
        //目标：计算n的阶乘
        System.out.println("5的阶乘：" + f(5));
        System.out.println("5的和：" + f1(5));

    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return   f(n - 1) * n;//递归调用
    }
    public static int f1(int n) {
        if (n == 1) {
            return 1;
        }
        return   f1(n - 1) + n;//递归调用
    }

}


