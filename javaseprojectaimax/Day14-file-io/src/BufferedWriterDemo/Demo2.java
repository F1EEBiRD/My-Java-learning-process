package BufferedWriterDemo;

import java.io.*;

public class Demo2 {
    private static final String SRC_FILE = "D:\\DLC\\Test.mp4";
    private static final String DEST_FILE = "D:\\EX";
    public static void main(String[] args) {
        // 目标：缓冲流，低级流的性能分析。
        //使用低级的字节流按照一个一个的字节的形式复制文件：完全无法使用，耗时过长，直接淘汰，禁止使用
        //copyFile1();
        //使用低级的字节流按照字节数组的形式复制文件：也比较慢，基本也无法使用
        copyFile2();
        //使用高级的缓冲字节流按照一个一个字节的形式复制文件：虽然是高级管道，但还是得一个一个字节复制，也不太推荐
        //copyFile3();
        //使用高级的缓冲字节流按照字节数组的形式复制文件：耗时短，效率更高，推荐使用
        copyFile4();
    }




    //使用低级的字节流按照一个一个的字节的形式复制文件。
    public  static  void copyFile1(){
        //拿系统当前时间
        long start = System.currentTimeMillis();//此刻时间毫秒值
        try(
                InputStream fis = new FileInputStream(SRC_FILE);
                OutputStream fos = new FileOutputStream(DEST_FILE + "1.mp4");
        ){
            int b;
            while((b = fis.read()) != -1){
                fos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级的字节流按照一个一个的字节的形式复制文件，耗时：" + (end - start) + "毫秒");
    }
    //使用低级的字节流按照字节数组的形式复制文件。
    private static void copyFile2() {
        long start = System.currentTimeMillis();
        try(
                InputStream fis = new FileInputStream(SRC_FILE);
                OutputStream fos = new FileOutputStream(DEST_FILE + "2.mp4");
        ){
            byte[] buffer = new byte[1024 * 64];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级的字节流按照字节数组的形式复制文件，耗时：" + (end - start) + "毫秒");
    }
    //使用高级的缓冲字节流按照一个一个字节的形式复制文件。
    private static void copyFile3() {
        long start = System.currentTimeMillis();
        try(
                InputStream fis = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(fis);
                OutputStream fos = new FileOutputStream(DEST_FILE + "3.mp4");
                OutputStream bos = new BufferedOutputStream(fos);
        ){
            byte[] bytes = new byte[1024*8];
            int len;
            while((len = fis.read()) != -1){
                bos.write(bytes, 0 ,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("高级的缓冲字节流按照一个一个字节的形式复制文件，耗时：" + (end - start) + "毫秒");
    }
    //使用高级的缓冲字节流按照字节数组的形式复制文件。
    private static void copyFile4() {
        long start = System.currentTimeMillis();
        try(
                InputStream fis = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(fis);
                OutputStream fos = new FileOutputStream(DEST_FILE + "4.mp4");
                OutputStream bos = new BufferedOutputStream(fos);
        ){
            byte[] bytes = new byte[1024 * 64];
            int len;
            while((len = fis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("高级的缓冲字节流按照字节数组的形式复制文件，耗时：" + (end - start) + "毫秒");
    }
}
