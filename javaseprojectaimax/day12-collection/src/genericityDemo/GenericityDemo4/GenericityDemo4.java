package genericityDemo.GenericityDemo4;

import genericityDemo.GenericityDemo3.Student;

public class GenericityDemo4 {
    public static void main(String[] args) {
        //目标：学会定义泛型方法，搞清楚作用。
        //需求：答应任意数组的内容
        String[] names = {"张三", "李四", "王五", "赵六"};
        printArray(names);

        Student[] stus = new Student[3];
        printArray(stus);

        Student max = getMax(stus);
        String max2 = getMax(names);
    }

    private static <T> void printArray(T[] names) {
    }

    private static <T> T getMax(T[] names) {
        return null;
    }
}

