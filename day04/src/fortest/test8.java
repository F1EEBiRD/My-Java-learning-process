package fortest;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        //定义数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        int x = number;
        //定义一个临时变量用于记录最终结果
        int temp = x;
        //定义num记录倒过来的数字
        int num = 0;
        while(x != 0){
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(num == temp);//记得比较


        }
    }

