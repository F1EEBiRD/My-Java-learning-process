package IFtest;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int wine = sc.nextInt();
        if (wine > 2) {
            System.out.println("可以喝");
        }

        boolean flag = true;
        if (flag) {
            System.out.println("flag的值为true");
        }

    }
}
