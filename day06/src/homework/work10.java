package homework;

import java.util.Random;

public class work10 {
    //一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
    // 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
    // 打印效果如下：（随机顺序，不一定是下面的顺序）
    //888元的奖金被抽出
    //588元的奖金被抽出
    //10000元的奖金被抽出
    //1000元的奖金被抽出
    //2元的奖金被抽出
    public static void main(String[] args) {
        //定义奖池的数组arr。
        int[] arr = {2,588,888,1000,10000};
        //定义数组brr保存抽取的奖项
        int[] brr = new int[arr.length];
        //定义一个变量index,用户代表数组brr的索引。
        int index = 0;
        //写一个while循环，如果index<arr.length则说明奖项没有被抽完继续抽取。
        //先创造随机数
        Random r = new Random();
        while(index < arr.length){
            int random = r.nextInt(arr.length);
            if(!contains(brr,random)){
                brr[index] = arr[random];
                index++;
                System.out.println(arr[random] + "元的奖金被抽出");
                System.out.println("还剩" + (arr.length - index) + "个奖项");
            }
        }

    }
    //定义方法，判断数组中是否存在某数字，存在返回true,不存在返回false。
    public static boolean contains(int[] arr,int number){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == number){
                return true;// 只要找到了，立刻返回true
            }
        }
        return false;//否则就返回 false
    }


}
