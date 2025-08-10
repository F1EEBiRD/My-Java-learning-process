package xunhuan;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        //需求：随机数范围 1~100

        //1 创建对象
        Random r = new Random();
        //2 生成随机数
        int num = r.nextInt(100) + 1;
        System.out.println(num);

        //秘诀
        //用来生成任意数到任意数之间的随机数 7~15
        //1.让这个范围头尾减去一个值，让这个范围从0开始 -7 0~8
        //2.尾巴+1 8 + 1 = 9
        //3.最终结果，再加上第一步减去的值
/*
        Random r = new Random();
        int num = r.nextInt(9) + 7;// 生成7 ~ 15随机数
                       // 先生成0~8随机数，然后结果 + 7
        System.out.println(num);
*/

    }
}
