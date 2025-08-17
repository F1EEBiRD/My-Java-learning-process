package exceptionDemo;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        //目标：掌握异常的处理方法 2：捕获异常对象，尝试重新修复
        //接受用户的一个定价
        System.out.println("==程序开始==");
        double price = 0;
        while (true) {
            try {
                price = userInputPrice();
                System.out.println("设置的定价是：" + price);
                break;
            } catch (Exception e) {
                System.out.println("价格输入有误，请重新输入！");
            }
        }
        System.out.println("==程序结束==");
    }

    private static double userInputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个价格：");
        double price = sc.nextDouble();
        return price;
    }
}
