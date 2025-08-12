package interface3;
// -- 定义第二套实现类，实现接口：实现打印学生信息（男女人数），实现打印平均分（去掉最高分和最低分）
public class ClassDateInterImpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDateInterImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        int maleCount = 0;//男生人数
        int femaleCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
            if (s.getSex() == '男') {
                maleCount++;
            }else if (s.getSex() == '女') {
                femaleCount++;
            }
        }
        System.out.println("男生人数：" + maleCount);
        System.out.println("女生人数：" + femaleCount);


    }

    @Override
    public void printAverageScore() {
        System.out.println("全班平均分是：");
        Student s1 = students[0];
        double sum = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();
        for (int i = 1; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();

            if (s.getScore() > max) {
                max = s.getScore();
            }

            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("最高分" + max);
        System.out.println("最低分" + min);
        System.out.println("平均分" + (sum - max - min) / (students.length - 2));

    }
}
