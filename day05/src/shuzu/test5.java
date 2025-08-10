package shuzu;

public class test5 {
    public static void main(String[] args) {
        //变化数据
        //定义一个数组，存储12345678910
        //要求：如果是奇数，则将当前数字扩大两倍
        //如果是偶数，则将当前数字变成二分之一


        //1.定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i 索引
            //arr[i] 元素
            //3.判断当前元素是否为奇数
            if (arr[i] % 2 == 1) {
                //4.如果是奇数，则将当前数字扩大两倍
                arr[i] = arr[i] * 2;
            }else{
            //5.判断当前元素是否为偶数
                arr[i] =  arr[i] / 2 ;
            }
        }
        //遍历数组
        //一个循环尽量只做一件事情
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
