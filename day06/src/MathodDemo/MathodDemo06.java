package MathodDemo;

public class MathodDemo06 {
    public static void main(String[] args) {
        //1.我要干什么？求圆的面积：
        //我干这件事情需要什么？ 圆的半径
        getArea(1.5);
    }
    public static void getArea(double radius){
        double result = 3.14 * radius * radius;
        System.out.println("圆的面积是：" + result);
    }
}
