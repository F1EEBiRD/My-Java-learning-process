package fortest;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        /*给定两个整数，被除数和除数
        将两数相除，要求不能使用乘法，除法和%运算符
                得到商和余数*/
        /*被除数 / 除数 = 商 ... 余数
        int a = 100;
        int b = 10;
        100 - 10 = 90
        90 - 10 = 80
        * */
        //定义被除数和除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();
        //定义一个变量用来统计减了多少
        int count = 0;
        //循环 while
        //在循环中，不断用被除数 - 除数
        while (dividend >= divisor){
            //将被除数减去除数，然后赋值给被除数，继续循环
            dividend = dividend - divisor;
            //只要减一次， 统计变量就自增一次
            count++ ;
        }
        System.out.println("余数：" + dividend);
        System.out.println("商：" + count);



    }
}
