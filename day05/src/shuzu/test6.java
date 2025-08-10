package shuzu;

public class test6 {
    public static void main(String[] args) {
        //定义一个数组，存储班级中50个学生的姓名，姓名未知，等学生报道再进行添加
        /*格式
        数据类型[]数据名 = new 数据类型 [数据的长度]；
        //在创建的时候，由我们自己指定数据的长度，由虚拟机给出默认的初始化值
        */
        //动态初始化↓↓↓↓↓↓
        String[] arr = new String[50];
        //添加学生
        arr[0] = "张三";
        arr[1] = "李四";
        //获取学生
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//因为还没添加，所以输出默认初始化值null


        //数组默认初始化值的规律
        //整数类型：默认初始化值为0
        //小数：默认初始化值为0.0
        //字符：默认初始化值为"\u0000" 空格
        //布尔：默认初始化值为false
        //引用类型：默认初始化值为null
        //↓手动给长度，系统给默认初始值，动态初始化
        //动态初始化
        int[] arr2 = new int[3];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0
    }
}
