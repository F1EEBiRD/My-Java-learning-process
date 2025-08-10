package homework;

import java.util.Scanner;

public class work {
    //键盘录入一个正整数
    //定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
    //在main方法中打印该数字是几位
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        //2.调用方法
        int length = getLength(num);
        //3.打印结果
        System.out.println(num + "是" + length + "位数");
    }
    //定义获取位数的方法，方法的参数是一个int类型，返回值类型是int。
    public static int getLength(int num){
        //在方法内部使用循环获取有多少位
        //可以不断的除以10，当结果为0时，循环结束。
        //除以10的次数，就是数字的位数。
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}

