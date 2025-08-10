package Test2;

public class test1 {
    public static void main(String[] args) {
        //三元运算符
        //取两个数最大值
        int number1 = 10;
        int number2 = 20;
        //关系表达式 ？ 表达式1 ： 表达式2
        //三元运算符必须被使用
        int max = number1 > number2  ? number1 : number2;
        System.out.println(max);
        System.out.println(number1 > number2 ? number1 : number2);


    }
}
