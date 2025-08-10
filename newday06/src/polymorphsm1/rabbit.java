package polymorphsm1;

public class rabbit extends  Animal{
    String name = "兔子";
    @Override
    public void run()
    {
        System.out.println("兔子跳的很快");
    }
}
