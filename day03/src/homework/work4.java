package homework;

import javax.swing.*;
import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int a = sc.nextInt();
        int b =a % 10;
        int c =a / 10 % 10;
        int d =a / 100 % 10;
        int e =b + c + d;
        System.out.println("每位数的和为" + e);

    }
}
