package homework;

public class work8 {
    public static void main(String[] args) {
        //定义一个方法copyOf(int[] arr, int newLength)
        //将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始

        //定义一个数组arr
        int[] arr = {1,2,3,4,5};
        //定义一个新数组newArr
        int[] newArr = copyOf(arr, 5);
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
    //定义方法
    public static int[] copyOf(int[] arr, int newLength){
        int[] newArr = new int[newLength];
        for(int i = 0; i < newLength; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    }

