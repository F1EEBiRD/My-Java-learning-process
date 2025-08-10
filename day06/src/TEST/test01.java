package TEST;

public class test01 {
    public static void main(String[] args) {
        //需求：定义方法，比较两个长方形的面积大小\
        //定义一个方法求长方形的面积

        //重复调用了方法
        double area1 = getArea(5.3,1.7);
        double area2 = getArea(2.4,2.6);

        if (area1 > area2){
            System.out.println("长方形1面积大");
        }else{
            System.out.println("长方形2面积大");
        }


    }
    //方法可以当作工具，可以重复调用
    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }

    //在以后实际开发当中，我们一般把重复代码或者具有独立功能的代码抽取方法当中
    //以后我们直接调用 方法
    //1.我要干什么？ 求长方形的面积
    //2.需要什么？两个长，两个宽
    //方法的调用处，是否需要继续使用方法的结果
    //如果要用，那么方法必须要有返回值
    //如果不用，方法可以写返回值，也可以不写
    /*public static void compare(double len1,double width1,double len2,double width2){
        double area1 = len1 * width1;
        double area2 = len2 * width2;
        if(area1 > area2){
            System.out.println("长方形1面积大");
        }else{
            System.out.println("长方形2面积大");
        }*/
    }





