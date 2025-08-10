package homework;

import java.util.Scanner;

public class work6 {
    /*有一个数组，其中有十个元素从小到大依次排列{12,14,23,45,66,68,70,77,90,91}。
    再通过键盘录入一个整数数字。
    要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。*/
    /*请输入一个整数数字：
     50
    生成的新数组是：12 14 23 45 50 66 68 70 77 90 91*/

    public static void main(String[] args) {
        //定义原数组arr
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        //定义比原数组长度大1的新数组brr。
        int[] brr = new int[arr.length + 1];
        //通过键盘录入的方式输入变量num的值。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数数字：");
        int num = scanner.nextInt();
        //定义变量index用于记录num存放的索引位置。
        int index = 0;
        //遍历数组，小于或等于num的元素直接存放到原来的位置，大于num的元素往后移动一个位置。
        for (int i = 0; i < arr.length; i++) {
            //如果元素小于要插入的数字，则存放到原来的位置。
            if (arr[i] > num) {
                //这里是存放到新数组brr的i位置。
                brr[i] = arr[i];
                //把i后面的位置记录下来
                index = i +1;
            }else {
                //如果元素大于要插入的数字,则往后一个位置存放
                brr[i + 1] = arr[i];
            }
        }
        //6.index存储的就是要插入的位置
        brr[index] = num;
        //7.输出新数组
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
}

