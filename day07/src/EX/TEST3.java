package EX;

import java.util.Scanner;

public class TEST3 {
    //先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
    public static void main(String[] args) {
        int[] number = {1, 9, 8, 3};
        //按方法一步步加密
        //1.先每位数+5
        for (int i = 0; i < number.length; i++) {
            number[i] += 5;
        }
        //2.对10求余
        for (int i = 0; i < number.length; i++) {
                number[i] %= 10;
            }
        //将所有数字再进行反转
        for (int i = 0, j = number.length - 1; i < j; i++, j--) {
                //定义临时变量
                int temp = number[i];
                number[i] = number[j];
                number[j] = temp;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        //拼接
        int newnumber = 0;
        for (int i = 0; i < number.length; i++) {
            newnumber = newnumber * 10 + number[i];
        }
        System.out.println(newnumber);

        }
    }

