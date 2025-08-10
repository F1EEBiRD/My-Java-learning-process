package TwoDimensionDemo;

public class TEST1 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6,7,8}};
        int[][] arr2 = {{1,2,3},{4,5,6,7,8}};
        //以后建议这样定义，把每一个一维数组，单独写一行
        //注意：每一个和一维数组其实是二位数组中的元素，所以每一个一维数组之间要用逗号隔开
        //最后一个一维数组后面不需要用逗号
        int[][] arr3 = {
                {1,2,3},
                {4,5,6,7,8}
        };

        //2.获取元素
        //arre[0]:二维数组中的第一个一维数组
        // arre[0][0]:二维数组中的第一个一维数组中的第一个元素
        //System.out.println(arr3[0][0]);//表示获取二维数组中的第一个一维数组
        //System.out.println(arr3[1][4]);

        //3.遍历二维数组
        //外循环：遍历二维数组，先遍历得到一维数组，再遍历一维数组写成一行
        for (int i = 0; i < arr3.length; i++) {
            //i：表示二维数组中的每一个索引
            //arr3[i]：表示二维数组中的每一个元素（一维数组）
            //内循环：遍历一维数组
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
    }

