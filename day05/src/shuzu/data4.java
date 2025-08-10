package shuzu;

public class data4 {
    public static void main(String[] args) {
        //需求：定义两个变量，交换两个变量记录的值
        int a = 10;
        int b = 20;


        //把变量b的值，赋值给了变量a，那么变量a的值就被覆盖了
       /* a = b;//a = 20 b = 20

        //又把已经被覆盖了的变量a的值，赋值给了变量b
        b = a;

        System.out.println(a);
        System.out.println(b);*/


        //定义一个临时第三方变量,暂时存储a的值
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    }

