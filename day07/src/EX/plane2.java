package EX;

import java.util.Scanner;

public class plane2 {
    public static void main(String[] args) {
    /*机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价，月份和头等舱或经济舱。
    按照如下规则进行计算机票价格：、
    旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折*/

        //2.判断月份是旺季还是淡季
        //3.判断当前机票是经济舱还是头等舱
        //4.根据实际情况计算出对应的机票价格

        //分析：
        //1.键盘录入机票原价，月份，头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入头等舱或经济舱(0为头等舱，1为经济舱)");
        int seat = sc.nextInt();
        //2.判断月份是旺季还是淡季
        if(month >= 5 && month <= 10){
            //旺季//3.继续判断当前机票是经济舱还是头等舱
            if(seat == 0){
                price = price * 0.9;
            }else if(seat == 1){
                price = price * 0.85;
            }
        }else if((month >=1 && month <= 4) ||( month >= 11 && month <= 12)){
            //淡季//3.继续判断当前机票是经济舱还是头等舱
            price = getPrice(seat, price);
        }else{
            //输入的月份有误
            System.out.println("输入的月份有误");
        }
        System.out.println("机票价格：" + price);
    }

    private static double getPrice(int seat, double price) {
        if(seat == 0){
            price = price * 0.7;
        }else if(seat == 1){
            price = price * 0.65;
        }else{
            System.out.println("输入的舱位有误");
        }
        return price;
    }
}
