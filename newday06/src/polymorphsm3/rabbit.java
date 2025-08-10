package polymorphsm3;

public class rabbit extends Animal {
    String name = "兔子";

    @Override
    public void run() {
        System.out.println("兔子跳的很快");
    }
    public void cry() {
        System.out.println("兔子叫的很响");
    }
}
