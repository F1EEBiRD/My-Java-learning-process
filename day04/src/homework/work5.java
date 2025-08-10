package homework;

import java.text.BreakIterator;
import java.util.Scanner;

public class work5 {
    //个税计算
    public static void main(String[] args) {
        //定义一个变量用来保存收入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前收入：");
        double money = sc.nextDouble();
        //定义个税的变量
        double tax = 0;
        //定义三险一金后的工资
        double smoney = money - (money * 0.1) ;
        System.out.println("三险一金后收入为：" + smoney);
        //定义个税-起征点的变量
        double taxable = smoney - 5000;
        //计算个税缴纳数额，起征点为5000
        if ( taxable <= 0 ) {
            System.out.println("您无需交税");
        }else if (taxable > 0 && taxable<= 3000){
             tax = taxable * 0.03;
             System.out.println("您需要缴纳" + tax + "个税");
        }else if (taxable > 3000 && taxable <= 12000 ){
            tax = (3000 * 0.03) + (taxable  - 3000) * 0.1;
            System.out.println("您需要缴纳" + tax + "个税");
        }else if(taxable > 12000 && taxable <= 25000){
            tax = (3000 * 0.03) + (9000 * 0.1) +((taxable - 12000) * 0.2);
            System.out.println("您需要缴纳" + tax + "个税");
        }else if(taxable <= 35000){
            tax = (3000 * 0.03) + (9000 * 0.1) + (13000 * 0.2) + ((taxable - 25000) * 0.25);
            System.out.println("您需要缴纳" + tax + "个税");
        }else if (taxable <= 55000){
            tax = (3000 * 0.03) + (9000 * 0.1) + (13000 * 0.2) + (10000 * 0.25) + ((taxable - 35000) * 0.3);
            System.out.println("您需要缴纳" + tax + "个税");
        }else if (taxable <= 80000){
            tax = (3000 * 0.03) + (9000 * 0.1) + (13000 * 0.2) + (10000 * 0.25) + (20000 * 0.3) + ((taxable - 55000) * 0.35);
            System.out.println("您需要缴纳" + tax + "个税");
        }else if (taxable > 80000){
            tax = (3000 * 0.03) + (9000 * 0.1) + (13000 * 0.2) + (10000 * 0.25) + (20000 * 0.3) + (25000 * 0.35) + ((taxable - 80000) * 0.45);
            System.out.println("您需要缴纳" + tax + "个税");
        }
        System.out.println("您的税是：" + tax);
        System.out.println("实际收入：" + (smoney - tax));
    }

}
