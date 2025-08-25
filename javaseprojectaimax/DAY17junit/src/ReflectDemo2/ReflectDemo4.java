package ReflectDemo2;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        //目标：搞清楚反射的应用：做框架的通用技术
        Cat c = new Cat("加菲", 5);
        SaveObjectFrameWork.saveObject(c);

        //创建学生对象
        Student s = new Student("小王", 18, "看电影");
        SaveObjectFrameWork.saveObject(s);

        //创建老师对象
        Teacher t = new Teacher("小李", 26, "Java，前端", 8000, "软件工程", '男', "123456");
        SaveObjectFrameWork.saveObject(t);


    }
}
