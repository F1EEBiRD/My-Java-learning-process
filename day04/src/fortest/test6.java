package fortest;

public class test6 {
    public static void main(String[] args) {
        //分析 double a = 0.1
        // a = a*2;
        // a *= 2;
        //定义一个变量用来计算山峰高度
        double height = 8844430;
        //定义一个变量用来记录纸张的初始厚度
        double paper = 0.1;
        //定义一个变量用来统计次数
        //int count = 0;
        //循环折叠智障，只要纸张厚度小于山峰，循环就继续
        //每折叠一次，统计次数就要++
        /*while (paper < height){
            //折叠纸张一次，++一次
            paper = paper * 2 ;
            count++;
        }
            System.out.println(count);*/
        int count = 0;
        for (count = 0; paper < height; count++) {
            paper = paper * 2;
        }
        System.out.println("最终次数为:" + count);











    }
}
