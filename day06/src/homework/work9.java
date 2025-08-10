package homework;

public class work9 {
    public static void main(String[] args) {
        //定义一个方法copyOfRange(int[] arr,int from, int to)
        //将数组arr中从索引from（包含from）开始，
        // 到索引to结束（不包含to）的元素复制到新数组中，
       //并将新数组返回。

        //定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] newArr = copyOfRange(arr, 2, 6);
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
    //定义方法
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to - from];
        for(int i = from; i < to; i++){
            newArr[i - from] = arr[i];
        }
        return newArr;
    }

}
