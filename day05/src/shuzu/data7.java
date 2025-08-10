package shuzu;

import java.util.Random;

public class data7 {
    public static void main(String[] args) {
        //需求：定义一个数组，存入1~5。要求打乱数组中的所有数据的顺序。


        //难点：
        //如何获取范围内的数组中的随机索引？
     /*   int[] arr = {1,2,3,4,5};
        //索引范围：0，1，2，3，4
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);
        System.out.println(randomIndex);*/


        //1.定义数组存储1~5
        int[] arr = {1,2,3,4,5};
        //2.循环遍历的数组，从0索引打乱数组的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生产一个随机索引
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //当循环结束之后，那么数组中的所有数据已经打乱顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
