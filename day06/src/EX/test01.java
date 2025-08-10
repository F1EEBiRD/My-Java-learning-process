package EX;

public class test01 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {11,22,33,44,55};
        //2.调用方法遍历数组
        printArray(arr);
    }
    //1.我要干嘛？遍历数组
    //2.我干这件事需要什么才能完成？ 形参 数组
    //方法的调用处是否需要继续使用结果？ 目前不需要
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }


}
