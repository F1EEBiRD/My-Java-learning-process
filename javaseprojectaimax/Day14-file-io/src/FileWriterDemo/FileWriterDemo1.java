package FileWriterDemo;

import CharSetDemo.CharSetDemo1;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚文件字符输出流的使用，写字符出去的流
        //1.创建文件字符输出流与目标文件接通
        try (
                Writer fw = new FileWriter("Day14-file-io/src/F1EEB1RD07-out.txt");
        ) {
            //2.写一个字符出去： public void write(int c)
            fw.write('a');
            fw.write(98);
            fw.write('好');
            fw.write("\r\n");//换行

            //3.写一个字符串出去： public void write(String str)
            fw.write("hello world");
            fw.write("\r\n");

            //4.写一个字符数组出去： public void write(char[] cbuf)
            char[] chars = "java" .toCharArray();
            fw.write(chars);
            fw.write("\r\n");



            //5.写一个字符数组的一部分出去： public void write(char[] cbuf, int off, int len)
            fw.write("java",1,2);
            fw.write("\r\n");

            //6.刷新流： public void flush()
            //fw.flush();//刷新缓冲区，将数据写出去，但是不关闭流，流可以继续使用
            //7.关闭流： public void close()
            //fw.close();//关闭流，会刷新缓冲区，将数据写出去，但是不能再使用
        }catch (Exception e) {
            e.printStackTrace();//输出异常信息
        }
    }
}
