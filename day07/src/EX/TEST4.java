package EX;

public class TEST4 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组中
        //反向推导

        //1.计算数组长度
        int num = 12345;
        //定义一个临时变量
        int temp = num;

        //获取数字的位数
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        //定义数组
        int[] number = new int[count];
        int index = number.length - 1;
        while (temp != 0) {
            number[index] = temp % 10;
            temp = temp / 10;
            index--;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }

        }
        }


