package homework;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("杨");
        t1.setId("9527");
        t1.teach();

        Teacher t2 = new Teacher("小王","9528");
        t2.teach();
    }
}
