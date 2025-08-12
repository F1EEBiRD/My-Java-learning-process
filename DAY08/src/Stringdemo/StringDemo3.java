package Stringdemo;

public class StringDemo3 {
    public static void main(String[] args) {
        //目标 ：生成验证码
        System.out.println(getCode(4));
        System.out.println(getCode(6));
        System.out.println(getCode(8));
    }

//帮我生成指定位数的随机验证码返回，每位可能是大小写字母或者数字。
    //帮我用String变量记住全部要用到的字符

    public static String getCode(int n ){
        //1.定义一个变量记住所有字符
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        //2.定义一个变量记住生成的验证码
        String code = "";
        //3.循环n次，每次生成一个随机字符，拼接到code中
        for (int i = 0; i < n; i++) {
            //4.获取一个随机索引
            int index = (int)(Math.random() * characters.length());
            //5.根据索引获取字符，凭借成字符串
            code += characters.charAt(index);
        }
        return code;
    }

























}

