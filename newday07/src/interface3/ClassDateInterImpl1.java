package interface3;

public class ClassDateInterImpl1 implements ClassDataInter{
    private Student[] students;//记住送来的全班学生对象信息
    public ClassDateInterImpl1(Student[] students){
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("全班平均分是：" + sum / students.length);

    }
}
