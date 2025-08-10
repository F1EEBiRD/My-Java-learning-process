package IFtest;

import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个票号：");
        int ticket = sc.nextInt();
        //只有当ticket在0~100之间，才是真实有效的票
        if(ticket >= 0 && ticket <= 100){
            //if的嵌套
            if (ticket % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }

    }
}
