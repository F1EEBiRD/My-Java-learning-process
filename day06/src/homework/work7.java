package homework;

public class work7 {
    public static void main(String[] args) {
        //定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
        //将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
        int[] arr = {1,2,3,4,5};
        fill(arr, 1, 3, 8);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //定义方法
    public static void fill(int[] arr,int fromIndex,int toIndex,int value){
        for(int i = fromIndex; i < toIndex; i++){
            arr[i] = value;

        }
    }
}
