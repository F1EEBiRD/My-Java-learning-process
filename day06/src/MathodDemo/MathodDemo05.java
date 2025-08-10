package MathodDemo;

public class MathodDemo05 {
    public static void main(String[] args) {
        getLength(5.2,1.3);
        //方法定义技巧
        //1.我要干什么 方法体 求长方形的周长
        //我干这件事需要什么才能完成？ 形参 需要长和
    }
    //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印
    //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法
    public static void getLength(double len, double width){
        double result = 2 * (len + width);
        System.out.println(result);
    }
}
