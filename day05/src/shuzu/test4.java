package shuzu;

public class test4 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //求和变量
        int sum = 0;
        //2.获取数组的长度,得到每一个数据 ，累加求和
        for (int i = 0; i < arr.length; i++) {
            //arr[i] 依次表示数组里的每一个元素
            sum =sum + arr[i];
        }
        //当循环结束之后，sum的值就是累加之后的结果
        System.out.println(sum);
    }
}
