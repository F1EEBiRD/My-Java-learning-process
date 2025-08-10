package shuzu;

public class test {
    public static void main(String[] args) {
        //统计个数
        //定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        //遍历数组得到每一个元素，统计数组里一共有多少个能被3整除的数字

        //1.定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义变量，统计次数
        int count = 0;
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i 表示数组里面的每一个索引
            //arr[i] 表示数组里面索引为i的元素 每一个
            //3.判断当前元素是否为3的倍数，如果是 那么统计变量自增一次
            if(arr[i] % 3 == 0){
                System.out.println(arr[i]);
                count++;
            }
        }
        //当循环结束之后，就表示所有数字都判断完毕了，直接打印count
        System.out.println("数组中能被3整除的有" + count + "个");

    }
}
