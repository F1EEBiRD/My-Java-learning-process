package homework;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        //模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入您要进行的运算（1:表示加法,2:表示减法,3:表示乘法,4:表示除法）：");
        int type = sc.nextInt();
        switch (type) {
            //把符号字符以便显示出来的是具体计算过程
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1 * 1.0 / num2));
                break;
            default:
                System.out.println("您输入的运算类别有误");
                break;
        }



    }
}
