package MathodDemo;

public class MathodDemo07 {
    public static void main(String[] args) {
        //目标：掌握带返回值方法的定义和调用格式
        //直接调用，用于无返回值
       /* getSum(10, 20, 30);*/

        //赋值调用
       /* double sum = getSum(10, 20, 30);
        System.out.println(sum);

        //输出调用
        System.out.println(getSum(10, 20, 30));*/


        //计算第一个季度的营业额
        double Sum1=getSum(10, 20, 30);
        //计算第二个季度的营业额
        double Sum2=getSum(20, 30, 40);
        //计算第三个季度的营业额
        double Sum3=getSum(20, 30, 40);
        //计算第四个季度的营业额
        double Sum4=getSum(20, 30, 40);

        //求全年的总营业额
        double sum = Sum1+Sum2+Sum3+Sum4;
        System.out.println("营业额为："+sum);



    }

    public static double getSum(double num1, double num2, double num3) {
        double result = num1 + num2 + num3 ;
        return result;//返回给方法的调用处

    }
}

