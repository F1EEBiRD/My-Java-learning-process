package CopyDemo;

import java.io.*;

public class CopyDemo2 {
    //目标：使用字节流完成文件的复制操作
    //源文件：D:\EX\test.jpg
    public static void main(String[] args)  {
        try{
            copyFile("D:/EX/test.jpg", "D:/EX/test_copy1.jpg");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void copyFile(String srcPath, String destPath)  throws  Exception{
        try (//这里只能放置资源对象，用完后会自动调用其close方法关闭
                InputStream  fis = new FileInputStream(srcPath);
                OutputStream fos = new FileOutputStream(destPath);
                MyConn conn = new MyConn();
        ) {
            //1.创建一个文件字节流输入流，把源文件读入到程序。（与源文件接通）

            //2.读取一个字节数组，写入一个字节数组 1024 + 1024 + 3
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);//读取多少个字节，就写入多少个字节
            }
            System.out.println("复制完成");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConn implements Closeable{
    @Override
    public void close() throws IOException {
        System.out.println("关闭连接");
    }
}


