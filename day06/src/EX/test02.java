package EX;

public class test02 {
    //设计一个方法求数组的最大值，并且将最大值返回
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = getMax(arr);
        System.out.println("最大值是：" + max);
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
