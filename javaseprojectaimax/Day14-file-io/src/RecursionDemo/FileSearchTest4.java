package RecursionDemo;

import java.io.File;
import java.io.IOException;

public class FileSearchTest4 {
    public static void main(String[] args)  {
        // 目标：完成文件搜索，找出D：盘下的FFXIVBoot.exe的位置
        try {
            File dir = new File("C:/");
            searchFile(dir, "QQ.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param dir 搜索的目录
     * @param fileName 要搜索的文件名
     */

    private static void searchFile(File dir, String fileName) throws IOException {
        //1.判断极端情况
        if (dir == null || !dir.exists() || dir.isFile()) {//1.判断目录是否存在
        return; //退出方法
    }
        //2.获取目录下的所有一级文件或者文件夹对象
        File[] files = dir.listFiles();

        //3.判断当前目录下是否存在一级文件对象，存在才可以遍历
        if (files != null && files.length > 0) {
            //4.遍历一级文件或者文件夹
            for (File file : files) {
                if (file.isFile()) {
                }if (file.getName().equals(fileName)){
                    System.out.println("找到文件：" + file.getAbsolutePath());
                    Runtime r = Runtime.getRuntime();
                    r.exec(file.getAbsolutePath());
                }else{
                    //如果当前一级文件对象是文件夹，则递归继续查找
                    searchFile(file, fileName);
                }
            }
          }
        }
    }

