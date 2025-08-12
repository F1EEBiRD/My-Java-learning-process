package Lambda;

import innerClass3.Student;

import javax.swing.*;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 目标：用Lambda表达式简化实际实例
        Test1();
        Test2();



    }
    public static void Test1(){
        Student[] students = new Student[6];
        students[0] = new Student("王德法", 18, 170, '男');
        students[1] = new Student("章鱼哥", 19, 160, '男');
        students[2] = new Student("海绵宝宝", 17, 160, '男');
        students[3] = new Student("谢老板", 18, 170, '男');
        students[4] = new Student("赵德柱", 19, 160, '男');
        students[5] = new Student("小钱", 17, 160, '男');

        //需求：按照年龄升序排序。可以调用sun公司写好的API直接对数组进行排序
        //  public static <T> void sort(T[] a, Comparator<? super T> c)
        //   参数一：需要排序的数组
        //   参数二：需要给sort声明一个 Comparator接口比较器对象（指定排序的规则）
        //  sort方法会调用匿名内对象的compare方法进行排序（对数组内的学生对象进行凉凉比较，从而实现排序。
  /*      Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o2.getAge() - o1.getAge();//按照年龄降序！
            }
        });*/

 /*       Arrays.sort(students, (Student o1, Student o2) -> {
                    return o2.getAge() - o1.getAge();//按照年龄降序！
                }
        );*/

/*        Arrays.sort(students, (o1,  o2) -> {
                    return o2.getAge() - o1.getAge();//按照年龄降序！
                }
        );*/
        Arrays.sort(students, (o1,  o2) -> o2.getAge() - o1.getAge());
                  //按照年龄降序！



        //遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }

    }
    public static void Test2(){
            //目标：搞清楚几个匿名内部类的使用场景
            //需求：创造一个登录窗口，窗口上只有一个登录按钮
            JFrame win = new JFrame("登录窗口");
            win.setSize(400, 300);
            win.setLocationRelativeTo(null);//居中显示
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            win.add(panel);

            JButton btn = new JButton("登录");
            panel.add(btn);

            //java要求必须给这个按钮添加一个点击事件监听器，这样就可以监听用户的点击操作，就可以做出反应。
            //开发中不是我们要主动去写匿名内部类，而是用别人的功能时，别人可以让我们写一个匿名内部类，我们才会写！
/*        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录成功！");

            }
        });*/
            btn.addActionListener(e -> System.out.println("登录成功！"));

            win.setVisible(true);

        }

    }

