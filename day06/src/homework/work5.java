package homework;

public class work5 {
    public static void main(String[] args) {
        //	定义一个方法equals(int[] arr1,int[] arr2).
        //比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(equals(arr1, arr2));

    }
    public static boolean equals(int[] arr1,int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
