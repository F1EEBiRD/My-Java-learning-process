package shuzu;

public class test2 {
    public static void main(String[] args) {
        //格式： 数组名[索引]
        int[] arr = {1,2,3,4,5};//数组是从0开始计算的 所以位置是01234，存了5组
        /*int number = arr[0];
        System.out.println(number);//1*/
        //获取数组中1索引上对应的数据，并直接打印出来
        //System.out.println(arr[1]);//2

        //2.把数据存储到数据中
        //格式： 数组名[] = 具体数据/变量
        //细节 ：一旦覆盖以后，原来的数据就不存在了。
        arr[0] = 100;//覆盖到了数组1中0的位置，整体都被覆盖了
        System.out.println(arr[0]);//100
    }
}
