package polymorphsm1;

public class Tortoise extends  Animal{
    String name = "乌龟";
    @Override
    public void run() {
        System.out.println("乌龟爬得慢");
    }
}
