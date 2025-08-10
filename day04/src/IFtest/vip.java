package IFtest;

import java.util.Scanner;

public class vip {
    public static void main(String[] args) {
        //1定义变量记录总价
        int price  = 1000;
        //2 键盘录入会员级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员级别：");
        int vip = sc.nextInt();
        //3.根据会员级别计算实际价格
        if(vip == 1){
            System.out.println("实际支付：" + (price * 0.9));
        }else if(vip == 2){
            System.out.println("实际支付：" + (price * 0.8));
        }else if(vip == 3){
            System.out.println("实际支付：" + (price * 0.7));
        }else{
            System.out.println("实际支付：" + price);
        }
    }
}
