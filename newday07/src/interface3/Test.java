package interface3;

public class Test {
    public static void main(String[] args) {
        // 目标：完成接口的小案例
        //1.定义学生类，创建学生对象，封装学生数据，才能交给别人处理学生的数据
        //2.准备学生数据，目前我们自己造一些测试数据
        Student[] allstudents = new Student[10];
        allstudents[0] = new Student("张三",'男',100);
        allstudents[1] = new Student("李四",'男',80);
        allstudents[2] = new Student("王五",'男',97.5);
        allstudents[3] = new Student("赵六",'男',85);
        allstudents[4] = new Student("孙七",'男',90);
        allstudents[5] = new Student("周八",'男',90);
        allstudents[6] = new Student("吴九",'男',70);
        allstudents[7] = new Student("郑十",'男',90);
        allstudents[8] = new Student("王十一",'女',90);
        allstudents[9] = new Student("王十二",'女',90);

        //3.提供两套业务实现方案，支持灵活切换（接耦合）:面向接口编程。
        //  --定义一个接口（规范思想）：必须完成答应全班学生信息，打印平均分
        //  --定义第一套实现类，实现接口：实现打印学生信息，实现打印平均分
        //  -- 定义第二套实现类，实现接口：实现打印学生信息（男女人数）
        ClassDataInter cdi = new ClassDateInterImpl2(allstudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
