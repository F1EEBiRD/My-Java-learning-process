package xunhuan;

import java.util.Scanner;

public class SkipLoopDemo3 {
    public static void main(String[] args) {
        /*键盘录入一个大于等于2的整数x,计算并返回 x的平方根
        * 结果只保留整数部分，小数部分将被舍弃*/

        //分析
        //平方根 16的平方根是4
        //      4的平方根是2

        //10
        //1 * 1 = 1 < 10
        //2 * 2 = 4 < 10
        //3 * 3 = 9 < 10
        //4 * 4 = 16 > 10
        //推断： 10的平方根是在 3~4之间

        //20
        //1 * 1 = 1 < 20
        //2 * 2 = 4 < 20
        //3 * 3 = 9 < 20
        //4 * 4 = 16 < 20
        //5 * 5 = 25 > 20

        //在代码中
        //从1开始循环，拿着数字的平方根跟原来的数字进行比较
        //如果小于的，那么继续往后判断
        //如果相等，当前数字就是平方根
        //如果大于，那么前一个数字就是平方根的整数部分

        //1录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正数：");
        int number = scanner.nextInt();
        //2 从一开始循环，拿着数字的平方根跟原来的数字进行比较
        for (int i = 1; i <= number; i++) {
            //用i * i再跟number比较
            if (i * i == number) {
                System.out.println(i + "就是" + number + "的平方根");
                //一旦找到了，循环就可以停止，跳出循环
                break;
            }else if (i * i > number){
                System.out.println(i - 1 + "就是" + number + "的平方根");
                break;
            }
        }
    }
}
