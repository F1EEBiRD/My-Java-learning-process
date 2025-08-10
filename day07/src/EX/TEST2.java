package EX;

import java.util.Scanner;

public class TEST2 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，
        // 请完成上述过程并计算出选手的得分。

        //分析：
        //1.定义一个数组，用来存储6名评委的打分（0~100）
        int [] scoresArr = getScores();
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.println(scoresArr[i]);
        }
        //2.求出数组中的最大值和最小值
        int max = getMax(scoresArr);
        int min = getMin(scoresArr);
        //4.求出数组中的和
        int sum = getSum(scoresArr);
        //5.（总和 - 最大值 - 最小值）/4
        int avg = (sum - max - min)/(scoresArr.length - 2);
        //打印结果
        System.out.println("选手的最终得分是：" + avg);
    }
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
    }
        return sum;
    }

    //最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }
        return max;
    }
    //最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (min > scoreArr[i]) {
                min = scoreArr[i];
            }
        }
        return min;
    }


    //1.定义一个数组，用来存储6名评委的打分（0~100）
    //2.我需要什么？不需要
    //3.干完这件事情需要返回数组
    public static int[] getScores() {
        //定义数组
        int[] scores = new int[6];
        //使用键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <  scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if(score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("输入的打分有误，请重新输入");
            }
    }
        return scores;
}
}
