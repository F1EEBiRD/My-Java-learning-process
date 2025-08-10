package EX;

public class test03 {
    public static void main(String[] args) {
        /*
    定义一个方法，判断数组中的某一个数是否存在，将结果返回调用处
    1.定义数组
    */
        int[] arr = {11, 22, 33, 44, 55};
        boolean result = contains(arr, 11);
        System.out.println(result);
    }

    //1.我要干嘛？ 判断数字在数组中是否存在
    //2.我要怎么做？ 需要什么？ 数组 数字
    //3.调用出是否需要继续使用结果？ 返回 true false
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        //什么时候才能断定数字不存在
        //当数组里面所有的数据全部比较完毕
        return false;
    }
}
//return break关键字的区别
//return：其实和循环没关系，跟方法有关，表示1结束方法 2返回结果
//        如果方法执行到了return，整个方法全部结束，里面的循环也就结束了。

//break：和方法无关，和循环有关，表示1结束当前循环 2结束方法，结束循环或者switch

