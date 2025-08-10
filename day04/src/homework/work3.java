package homework;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        /*存入一定金额（1000起存，存一定年限（四选一，计算到期后得到的本息总额*/
        //1.定义金额、年限、利率
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额（1000起）：");
        double money = sc.nextInt();
        System.out.println("请输入年限：一年 两年 三年 五年");
        int year = sc.nextInt();
        //定义利率
        double rate = 0.0;
        //判断年份
        if (year == 1){
            rate = 2.25;
        }else if (year == 2){
            rate = 2.7 *2;
        }else if (year == 3){
            rate = 3.25 *3;
        }else if (year == 5){
            rate = 3.6 *5;
        }else{
            System.out.println("请输入正确年份");
        }
        double interest = money * rate * 0.01 * year;
        double total = money + interest;
        //输出结果
        System.out.println("存款为：" + money + "，利率为：" + rate + "，存款年限：" + year + "，利息为：" + interest + "，本息合计为：" + total);



    }
}
