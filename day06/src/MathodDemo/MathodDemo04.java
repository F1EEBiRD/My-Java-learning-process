package MathodDemo;

public class MathodDemo04 {
    public static void main(String[] args) {
        //需要注意：方法调用时，必须按照方法定义的参数顺序进行调用，并且需要定义一致
        //实参↓↓↓↓↓↓ 全称实际参数，方法调用中的参数
        method(10,20);

        int a = 10;
        int b = 20;
        method(a,b);
    }
    public static void method(int num1, int num2 ){
        //                     ↑↑↑↑↑形参：全称形式参数，是指方法定义中的参数
        int result = num1 + num2;
        System.out.println(result);
    }
}
