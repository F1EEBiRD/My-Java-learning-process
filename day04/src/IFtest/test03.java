package IFtest;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的钱：");
        int money = sc.nextInt();
        if (money > 100) {
            System.out.println("吃顿好的");
        } else {
            System.out.println("吃顿差的");
        }
    }

}
