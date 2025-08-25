package VisitDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        //某班级要组织秋游活动，有四个景点的数据可以选择，
        // 依次是：“东湖”、"黄鹤楼"、“木兰文化区”、“归元禅寺”，
        // 每名学生最多可以选择两个想去的景点，最少要选择1个想去的景点，
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#10002,赵敏,女,2023-07-22 09:11:21,黄鹤楼-归元禅寺#10003,周芷若,女,2023-07-22 04:11:21,木兰文化区-东湖#10004,小昭,女,2023-07-22 08:11:21,东湖#10005,灭绝,女,2023-07-22 17:11:21,归元禅寺";
        // 业务一:解析学生信息，封装成Student对象，并添加到List集合中
        String[] records = info.split("#");
        List<Student> students = new ArrayList<>();
        for (String rec : records) {
            students.add(parseOne(rec));
        }

        System.out.println("学生总数：" + students.size());  // 5
        for (Student s : students) {
            System.out.println(s);
        }

        //业务二：遍历List<Student>集合，统计里面每个经典选择的次数，并输出经典名称和选择的次数
        Map<String, Integer> counts = new HashMap<>();
        //遍历学生对象
        for (Student stu : students) {
            //获取学生选择的景点
            for (String spot : stu.getVisitPlace()) {
                // 累加统计
                counts.put(spot, counts.getOrDefault(spot, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " 被选择了 " + entry.getValue() + " 次");
        }
        System.out.println("================================================");

        //业务三：计算出哪个景点想去的人数最多，以及哪些人没有选择这个最多人想去的景点。
        //计算哪个经典景点被选择了最多人
        String maxSpot = null;   // 最多人选择的景点
        int maxCount = 0;        // 对应次数
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                maxSpot = e.getKey();
            }
        }
        System.out.println("最多人选择的景点是：" + maxSpot + "，人数=" + maxCount);

        // 哪些人没有选择这个最多人想去的景点
        for (Student stu : students) {
            if (!stu.getVisitPlace().contains(maxSpot)) {
                System.out.println(stu.getName() + " 没有选择 " + maxSpot);
            }
        }



    }





    // 解析学生对象方法，为创建对象提供方法
    public static Student parseOne(String record) {
        String[] parts = record.split(",");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return new Student(
                Long.parseLong(parts[0].trim()),
                parts[1].trim(),
                parts[2].trim(),
                LocalDateTime.parse(parts[3].trim(), fmt),
                Arrays.asList(parts[4].trim().split("-"))
        );
    }
}
