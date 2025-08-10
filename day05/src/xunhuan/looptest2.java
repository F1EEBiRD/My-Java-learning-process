package xunhuan;

import java.util.Random;

public class looptest2 {
    public static void main(String[] args) {
        //猜数字小游戏
        //需求：程序自动生产一个1-100之间的随机数，使用程序实现猜出这个数字是多少？random
        //获取随机数 范围0~10


        //1.导包
        //2.创建对象
        Random r = new Random();
        //3.生成随机数
        //判断技巧：
        //在小括号中，书写的是生成随机数的范围
        //范围一定是从0开始的。
        //到这个书-1结束
        //口诀：包头不包尾，包左不包右
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10);//0~99 ，包含左边的0，但不包含100
            System.out.println("随机数是：" + number);


        }
    }
}
