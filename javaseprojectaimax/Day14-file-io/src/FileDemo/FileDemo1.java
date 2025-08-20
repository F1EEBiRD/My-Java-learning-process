package FileDemo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //目标：File类创建对象

        //1.创建File一级文件
        File f1 = new File("D:\\EX\\AAA");
        System.out.println(f1.mkdir());

        //2.创建File多级文件
        File f2 = new File("D:\\EX\\BBB\\CCC\\DDD");
        System.out.println(f2.mkdirs());

        //3.创建File对象，代表存在文件，然后删除他
        File f3 = new File("D:\\EX\\BBB\\CCC\\DDD\\eee.txt");
        System.out.println(f3.delete());

        File f4 = new File("D:\\EX\\BBB\\CCC\\DDD");//只能删空文件
        System.out.println(f4.delete());

        //4.获取某个目录下的全部一级文件名称（不能读取2级）
        File f5 = new File("D:\\学习");
        String[] names = f5.list();
        for (String name : names) {
            System.out.println(name);
        }

        //
        File[] files = f5.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile());//获取绝对路径
        }






    }
}
