package BufferedReaderDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Demo1 {
    public static void main(String[] args) {
        //目标：搞清楚缓存字符输入流读取字符内容：性能提升了，多了按照行读取文本的功能

        try (
            //1,创建文件字符输入流与源文件接通
            Reader fr = new FileReader("Day14-file-io\\src\\F1EEB1RD4.txt");
            //2,创建缓存字符输入流包装低级的字符输入流
            BufferedReader br = new BufferedReader(fr);
        ){
            /*//2.定义一个字符数组，每次读多个字符
            char[] chs = new char[1024];
            int len;//定义一个变量记录每次读取了多少字符
            while ((len = br.read(chs)) != -1){
                //3.把字符数组转换成字符串，并输出
                System.out.print(new String(chs,0,len));
            }*/
/*            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());*/
            //使用循环改进，来按照行读取数据
            //定义一个字符串变量用于记住每次读取的一行数据
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            //目前读取文本最优雅的方案
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
