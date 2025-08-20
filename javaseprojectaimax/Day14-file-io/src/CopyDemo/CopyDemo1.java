package CopyDemo;

import java.io.*;

public class CopyDemo1 {
    //目标：使用字节流完成文件的复制操作
    //源文件：D:\EX\test.jpg
    public static void main(String[] args)  {
        try{
            copyFile("D:/EX/test.jpg", "D:/EX/test_copy.jpg");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void copyFile(String srcPath, String destPath)  throws  Exception{
        InputStream fis = null;
        OutputStream fos = null;
        try {
            //1.创建一个文件字节流输入流，把源文件读入到程序。（与源文件接通）
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(destPath);
            //2.读取一个字节数组，写入一个字节数组 1024 + 1024 + 3
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);//读取多少个字节，就写入多少个字节
            }
            System.out.println("复制完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //最后一定会执行一次，即便程序出现一场
            //3.关闭流
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

