package dowhile;

public class test1 {
    public static void main(String[] args) {
        int a = 10;
        do{
            System.out.println(a);
            a++;
        }while(a < 20);
        System.out.println("循环结束" + a);
    }
}
