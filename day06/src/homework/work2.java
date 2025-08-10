package homework;

public class work2 {
    //定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
    public static void main(String[] args) {
 /*       int a = 10;
        int b = 20;
        int c = 30;
        int max = getMax(a, b, c);
        System.out.println(max);*/
        //牢记！！！！简单写法
        System.out.println(getMax(10, 20, 30));
    }
    public static int getMax(int a, int b, int c) {
  /*      //核心代码
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;*/
        //三元运算符
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }



}




