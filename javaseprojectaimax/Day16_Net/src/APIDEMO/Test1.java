package APIDEMO;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import  java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //目标：掌握java提供的获取时间的方案
        //JDK8 之前的方案 ： Date 老项目还在用
        Date date = new Date();
        System.out.println(date);
        //long time = System.currentTimeMillis();

        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String format = sdf.format(date);
        System.out.println(format);

        //JDK8 之后的方案：LocalDate LocalTime LocalDateTime 获取此刻日期时间 新项目推荐
        //获取此刻的日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        //获取星期几
        System.out.println(now.getDayOfWeek().getValue());

        //格式化：DataTimeFormatter
        //1.创建一个格式化对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        //2.格式化now对象的时间
        String format1 = dtf.format(now);
        System.out.println(format1);
    }
}
