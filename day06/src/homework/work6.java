package homework;

public class work6 {
    public static void main(String[] args) {
        //定义一个方法fill(int[] arr,int value)
        //将数组arr中的所有元素的值改为value(意思就是全部改成同一个数）
        int[] arr = {1,2,3,4,5};
        fill(arr, 7);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //定义方法
    public static void fill(int[] arr,int value){
        for(int i = 0; i < arr.length; i++){
            arr[i] = value;
        }

    }
}
