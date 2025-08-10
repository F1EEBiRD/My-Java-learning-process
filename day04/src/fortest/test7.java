package fortest;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        /*给一个回文数x
                如果x是一个回文整数，打印"true",否则打印"false"*/
        //核心思路:把数字倒过来跟原来的数字进行比较
        //1.定义数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int x = sc.nextInt();
        //定义一个临时变量用于记录x原来的值，用于进行最后比较
        int temp = x;
        //记录倒过来的结果
        int num = 0;
        while(x != 0){
            //从右往左获取每一个数字
            int ge = x % 10;
            //修改当前x记录的值
            x = x / 10;
            //把当前获取的数字拼接到最右边
            num = num * 10 + ge;
        }
    //打印最终结果
        System.out.println(num);
        //比较num和x是否相等
       System.out.println(num == temp);

        /*int x = 12345;
        //2.获得个位
        int ge = x % 10;
        //2.获得十位
        int shi = x / 10 % 10;

        //拼接
        int result = ge * 10 + shi;
        System.out.println(result);*/

        }
    }



