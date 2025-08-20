package FileDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileDemo2 {
    public static void main(String[] args) {
        //目标：掌握File遍历一级文件对象的操作
        File f1 = new File("D:\\EX\\test1.txt");
        File f2 = new File("D:\\EX\\AAA");

        File[] files = f2.listFiles();
        System.out.println(Arrays.toString(files));


    }
}
