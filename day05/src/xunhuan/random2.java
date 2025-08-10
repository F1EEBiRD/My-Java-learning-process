package xunhuan;

import java.util.Random;
import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {
    //猜数字小游戏
    //需求：程序自动生产一个1-100之间的随机数，使用程序实现猜出这个数字是多少
        //注意点！！
        //生成随机数的代码 int number = r.nextInt(100)+ 1;
        //不能卸载循环的里面，否则每次都会产生一个新的随机数

        //抽奖机制
        //扩展需求：加保底机制，三次猜不中，直接提示中奖
        //2.抽奖游戏
        //用点卷抽奖励



        //计数器
        //统计已经猜了多少次了
        int count = 0;

    //1.生成1-100随机数
    Random r = new Random();
    int number = r.nextInt(100) + 1;
    System.out.println(number);
    //2.猜这个数字是多少
    Scanner sc = new Scanner(System.in);
    while ( true) {
        System.out.println("请输入你要猜的数字：");
        int guessNumber = sc.nextInt();
        count++;
        if(count == 3){
            System.out.println("保底触发成功");
            break;
        }
        if (guessNumber > number) {
            System.out.println("你猜的数字太大了");
        } else if (guessNumber < number) {
            System.out.println("你猜的数字太小了");
        } else {
            System.out.println("恭喜你猜对了");
            break;
        }
    }
  }
}