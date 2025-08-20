package CharSetDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：写程序实现字符编码和解码
        //1.编码
        String name = "努力学习666";

        //byte[] bytes = name.getBytes();//平台的字符集UTF-8编码
        byte[] bytes = name.getBytes("GBK");//指定GBK编码
        System.out.println( bytes.length);
        System.out.println(Arrays.toString(bytes));

        //2.解码
        //String name2 = new String(bytes);//平台的字符集UTF-8解码
        String name2 = new String(bytes,"GBK");//指定GBK解码
        System.out.println(name2);
    }
}
