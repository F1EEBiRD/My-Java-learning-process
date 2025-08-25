package ProxtDemo4;

public class Test {
    public static void main(String[] args) {
        //目标：创建代理对象
        //1.准备一个明星对象，设计明星类
        Star star = new Star("周杰伦");
        //2.为周杰伦创建专属的代理对象
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("《七里香》");
        System.out.println(proxy.dance());

    }
}
