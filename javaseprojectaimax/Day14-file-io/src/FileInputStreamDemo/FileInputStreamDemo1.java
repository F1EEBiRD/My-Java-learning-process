package FileInputStreamDemo;

import javax.naming.ldap.SortResponseControl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输出流读取文件中的字节数组到内存中来。
        //1,创造文件字节输入流管道于源文件接通\
        //InputStream is = new FileInputStream(new File("Day14-file-io\\src\\F1EEB1RD.txt.txt"));
        InputStream is = new FileInputStream("Day14-file-io\\src\\F1EEB1RDtest2");//简化


        //2.开始读取文件中的字节并输出：每次读一个
        //定义一个变量记住每次读取的一个字节
/*        int b;
        while((b = is.read()) != -1){
            System.out.print((char)b);//把字节转换成字符输出
        }*/
        //每次读取一个字节的问题：性能较差，读取汉字输出会乱码！

        //定义一个字节数组用于每次读取字节：每次读取3字节
        byte[] buffer = new byte[3];
        //定义一个变量记录每次读取了多少字节
        int len;
        while((len = is.read(buffer)) != -1){
            //3.把读取到的字节数组转换成字符串输出，读取多少倒出多少
            String str = new String(buffer,0,len);
            System.out.print(str);
        }

        //拓展：每次读取多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘和内存的交互次数，从而提升性能。
        //but依然无法避免读取汉字输出乱码的问题：存在汉字被截断字节的可能性


    }
}
