package shuzu;

import java.util.Random;

public class data3 {
    public static void main(String[] args) {
        //求和
        /*需求，生成10个1-100之间的随机数存入数组
        1）求出所有数据的和
        2）求出所有数据的平均值
        3）统计有多少个数据比平均值小
        */

        //分析
        //1.定义数组
        //推荐使用动态初始化
        int[] arr = new int[10];
        //2.生成随机数存入数组中
        Random r = new Random();
        //长度设定为了10，所以length为10
        for (int i = 0; i < arr.length; i++) {
            int number  = r.nextInt(100) +1;
            //把生成的随机数保存到数组中
            //数组名[索引] = 数据；
            arr[i] = number;
        }
        //遍历数组，一个循环只干一件事
        for (int i = 0; i < arr.length; i++) {
            //删除ln就能让数据显示在同一行，并且添加空格看起来更直观
            System.out.print(arr[i] + " ");
        }
        // 1）求出所有数组的和
        //定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //循环得到每个元素并把元素累加到sum中
            sum += arr[i];
        }
        System.out.println(sum);
        // 2）求出所有数组的平均值 总数/数组长度
        int avg = sum / arr.length;
        System.out.println("平均数为" + avg);

        // 3）统计有多少个数据比平均值小
        //定义统计变量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }

        }
        System.out.println("在数组中共有" + count + "个数据比平均值小");

        //遍历数据，验证答案
    }
}
