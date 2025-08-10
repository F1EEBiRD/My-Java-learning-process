package xunhuan;

import java.util.Scanner;

public class SkipLooDemo4 {
    public static void main(String[] args) {
        //需求：键盘录入一个正证书，判断是否是质数

        //质数：一个整数只能被1和自身整除的数
        //7 = 1 * 7 质数
        //8 = 1 * 8 / 2 * 4 不是质数 是合数

        //分析
        //1.键盘录入一个正整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();

        //定义一个变量，表示标记
        //标记着number是否为一个质数
        //true: 是一个质数
        //false: 不是一个质数
        boolean flag = true;




        //2 判断
        //写一个循环，从2开始判断， 一直判断到number-1
        //在范围内，有没有数字可以被number整除。如果有，那么number就不是质数
        //如果没有，那就是质数
        for (int i = 2; i < number; i++) {
            //i依次表示这个范围内的每一个数字
            //看number是否能被i整除
            if (number % i == 0) {
                flag = false;
               /* System.out.println(number + "不是质数");*/
                //一旦找到了，循环就可以停止，跳出循环
                break;
            }/*else if (i * i > number){
                System.out.println(number + "是质数");
                break;*/
            }
        if (flag) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
        }
    }

