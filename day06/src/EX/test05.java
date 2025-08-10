package EX;

public class test05 {
    public static void main(String[] args) {
        //数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
        // 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
        //1. 方法的功能是得到一个小数的绝对值，参数应该是一个小数类型。
        //2. 绝对值需要被返回，返回值类型应该也是小数类型。
        double sum = getAbs(-5.2);
        //在主方法中调用绝对值方法，传入参数num,并接受返回值。
        System.out.println(sum);

    }
    //定义获取绝对值的方法，方法的参数是一个double类型，返回值类型是double。
    public static double getAbs(double num){
        //在方法内部使用if..else..判断
        //如果是负数则对负数取反并返回。
        //如果不是负数则直接返回数字本身。
        if(num < 0){
            return -num;
        }else{
            return num;
        }

    }
}
