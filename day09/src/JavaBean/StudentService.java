package JavaBean;

public class StudentService {
    //必须拿到要处理的学生对象
    private Student s;//用于记住将来要操作的学生对象。

    public StudentService(Student s){
        this.s = s;
    }


    //提供方法：打印学生对象的总成绩
    public void printScore( ){
        System.out.println(s.getName() + "的总成绩是：" + (s.getChinese() + s.getMath()));

    }

    //提供方法：打印学生的平均成绩
    public void printAvgScroe( ){
        System.out.println(s.getName() + "的平均成绩是：" + (s.getChinese() + s.getMath())/2);

    }

}
