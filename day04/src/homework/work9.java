package homework;

public class work9 {
    public static void main(String[] args) {
        for (int i = 1988; i <= 2019; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.print(i + "是闰年");
            }
        }
    }
}

