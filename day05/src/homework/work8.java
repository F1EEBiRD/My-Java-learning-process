package homework;

public class work8 {
    public static void main(String[] args) {
        //定义一个数组其中包含多个数字。
        // 用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
        // （可以创建其他数组，不必须在原数组中改变）

        //定义一个原数组arr，其中包含多个数字。
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义新数组brr，和arr的长度一样。
        int[] brr = new int[arr.length];
        //定义变量left，初始值是0准备从左边放元素，定义变量right，初始值是arr.length-1准备从右边放元素。
        int left = 0;
        int right = arr.length-1;
        //对原数组arr进行遍历。
        for (int i = 0; i < arr.length; i++) {
            //判断当前元素是否是奇数。
            if (arr[i] % 2 !=1 ){
                //设置奇数放左边
                brr[left] = arr[i];
                //左边索引自增1,排序
                left++;
        }else {
                //设置偶数放右边
                brr[right] = arr[i];
                //右边索引自减1，排序
                right--;
            }
        }
        //打印新数组brr
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+"\t");
        }
    }
}
