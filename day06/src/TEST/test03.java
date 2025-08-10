package TEST;

public class test03 {
    public static void main(String[] args) {
        compare(10, 10);
        compare((byte) 10, (byte)20);

    }
    //需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
    //要求：兼容全整数类型（byte,short,int,long）
    public static void compare(byte a1, byte a2) {
        System.out.println(a1 == a2);
        System.out.println("byte");
    }
    public static void compare(short b1, short b2) {
        System.out.println(b1 == b2);
        System.out.println("short");

    }
    public static void compare(int c1, int c2) {
        System.out.println(c1 == c2);
        System.out.println("int");
    }
    public static void compare(long d1, long d2) {
        System.out.println(d1 == d2);
        System.out.println("long");
    }
}

