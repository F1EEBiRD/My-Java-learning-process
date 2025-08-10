package homework;

import java.util.Random;

public class work3 {
    public static void main(String[] args) {
        //创建一个长度为6的整数数组。
        // 请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，
        // 然后计算出数组中所有元素的和并打印。

        //1.创建一个数组
        int[] arr = new int[6];
        //生产一个随机数组
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //2.生成随机数
            int number  = r.nextInt(100) +1;
            //3.将随机数保存到数组中
            arr[i] = number;
        }
        //4.遍历数组，一个循环只干一件事
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
