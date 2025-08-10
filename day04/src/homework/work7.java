package homework;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        //键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        //获取最大值和最小值
        int max = number1 > number2 ? number1 : number2;
        int min = number1 < number2 ? number1 : number2;
        //累加求和
        int sum = 0;
        for(int i = min; i <= max; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }


    }

