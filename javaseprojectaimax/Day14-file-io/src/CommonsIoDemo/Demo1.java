package CommonsIoDemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo1 {
    public static void main(String[] args) throws IOException {
    //目标：IO框架
    FileUtils.copyFile(new File("Day14-file-io\\src\\F1EEB1RD4.txt"), new File("Day14-file-io\\src\\F1EEB1RD08.txt") );

    //JDK7提供的
    //Files.copy(Path.of("Day14-file-io\\src\\F1EEB1RD4.txt"), Path.of("Day14-file-io\\src\\F1EEB1RD09.txt"));

    //删除
    FileUtils.deleteDirectory(new File("D:\\EX\\BBB\\CCC\\DDD"));


    }
}
