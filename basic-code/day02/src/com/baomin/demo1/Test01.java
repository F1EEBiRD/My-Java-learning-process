package com.baomin.demo1;

public class Test01 {
    public static void main(String[] args) {
        //定义一个变量记录整数10
        int num = 10;
        //记录第二个变量记录整数20
        int num2 = 20;
        //让两个整数相加
        int res = num + num2;
        System.out.println(res);
    }

    // 添加一个可以被测试的方法
    public static int add(int a, int b) {
        return a + b;
    }
}
