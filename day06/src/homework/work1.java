package homework;

public class work1 {
    //定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
    public static void main(String[] args) {
        System.out.println(getMin(1.2,2.3));

    }
    public static double getMin(double a,double b){
     /*   if(a<b){
            return a;
        }else{
            return b;
        }*/
        //三元运算符
        double min = a < b ? a : b;
        return min;

    }
}
