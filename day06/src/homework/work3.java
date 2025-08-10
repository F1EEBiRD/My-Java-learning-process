package homework;

import java.util.Scanner;

public class work3 {
    //在主方法中通过键盘录入三个整数。
    // 定义一个方法，方法接收三个整数变量，
    // 在方法中从大到小依次打印三个变量。执行效果如下：
    public static void main(String[] args) {
        //首先录入三个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        int max = getMax(a,b,c);
        int min = getMin(a,b,c);
        int mid = a + b + c - max - min;
        System.out.print("从大到小的顺序为" + max +" " + mid + " " + min);





    }
    //定义method方法
    public static int getMax(int a,int b,int c) {
        //使用if..else..多分支判断语句或者三元运算符计算三个整数中的最大值并赋值给max。
  /*      int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;*/


        //三元运算符
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }
    public static int getMin(int a,int b,int c) {
        //使用if..else..多分支判断语句或者三元运算符计算三个整数中的最小值并赋值给min。
   /*     int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;*/

        //三元运算符
        int temp = a < b ? a : b;
        int min = temp < c ? temp : c;
        return min;
    }

    }

