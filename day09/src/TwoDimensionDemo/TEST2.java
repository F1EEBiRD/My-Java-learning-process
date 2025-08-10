package TwoDimensionDemo;

public class TEST2 {
    public static void main(String[] args) {
        //二维数组动态初始化格式
        int[][] arr = new int[3][5];

        arr[0][0] = 10;

        //遍历二维数组
        //外循环:遍二维数组获取里面的一维数组
        //内循环：遍历一维数组获取里面的每一个元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
