package homework;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        /*让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("最小值为：" + a);
        } else if (b < a && b < c) {
            System.out.println("最小值为：" + b);
        } else {
            System.out.println("最小值为：" + c);
        }

    }
}
