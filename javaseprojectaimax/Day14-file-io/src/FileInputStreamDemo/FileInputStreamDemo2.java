package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("Day14-file-io\\src\\F1EEB1RD3");
        //测试一次性读完全部字节(只适合小文件！)（读特别大可能内存溢出，内存大小决定）
        byte[] bytes = is.readAllBytes();

        String rs = new String(bytes);
        System.out.println(rs);

    }
}
