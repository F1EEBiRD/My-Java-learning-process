package IFtest;

import java.util.Scanner;

public class paytest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入整数表示实际支付的钱");
        int money = sc.nextInt();
        if (money >= 600){
            System.out.println("付款成功");
        }else{
            System.out.println("支付失败");
        }
    }
}
