package EX;

public class TEST5 {
    public static void main(String[] args) {
        
    
    //解密

    //1.定义数组记录解密后的结果
    int[] arr ={8,3,4,6};
    //2.反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =  temp;
        }
        //由于加密是通过对10取余的方式进行获取的
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }

        }
    }

    
    

