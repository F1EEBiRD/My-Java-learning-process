package homework;

public class work4 {
    public static void main(String[] args) {
        /*现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，
        从数组的最大索引位置开始到最小索引位置，
        依次表示整数的个位、十位、百位。。。依次类推。
        请编写程序计算，这个数组所表示的整数值。例如：*/

        //1.定义int类型数组，使用静态初始化，将数字存入数组。
        int[] arr = {2, 1, 3, 5, 4};
        //2.定义变量sum用来存储最终的数值。
        int sum = 0;
        //对数组进行遍历，遍历开始索引是0，结束索引是arr.length-1。
        for (int i = 0; i < arr.length; i++) {
            //在循环中，把num的值乘10再加上元素的值，赋值给num变量。
            sum = sum * 10 + arr[i];
            System.out.println(sum);
        }
        //循环上面的步骤，num的值即为所求，打印结果。
        System.out.println("数组所表示的整数为：" + sum);

    }
}
