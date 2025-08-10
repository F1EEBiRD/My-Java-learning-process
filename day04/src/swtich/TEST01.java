package swtich;

import java.util.Scanner;

public class TEST01 {
    public static void main(String[] args) {
        //定义变量记录想吃的面
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想吃的面：");
        String noodles = sc.next();
        switch (noodles){
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西牛肉面":
                System.out.println("陕西牛肉面");
                break;
            default:
                System.out.println("吃泡面");
                break;
        }
    }
}
