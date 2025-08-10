package homework;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        /*普通顾客购不满100元不打折，满100元打9折；
        会员购物不满200元打8折，满200元打7.5折；
        不同打折规则不累加计算。
        请根据此优惠计划进行购物结算，
        键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），
        输出应付金额（小数类型）。*/
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类别：0普通顾客 1会员");
        int type = sc.nextInt();
        System.out.println("请输入购物金额");
        int money = sc.nextInt();
        //判断客户类型
        if (type == 0) {
            System.out.println("您是普通客户");
            if (money > 0 && money < 100) {
                System.out.println("您应该支付" + money);
            } else if (money >= 100) {
                System.out.println("您应支付" + (money * 0.9));
            } else {
                System.out.println("您输入的金额有误");
            }
        } else if (type == 1) {
            System.out.println("您是会员");
            if (money > 0 && money < 200) {
                System.out.println("您应该支付" + (money * 0.8));
            } else if (money >= 200) {
                System.out.println("您应该支付" + (money * 0.75));
            }
        } else {
            System.out.println("输出错误，请重试");
        }
        }
        }





