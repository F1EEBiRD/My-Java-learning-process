package Phone;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone("小米" , 3999 , "黑色" );
        p.call();


        Phone p1 = new Phone();
        p1.setBrand("华为");
        p1.setColor("蓝色");
        p1.setPrice(5999);
        p1.sendMessage();
    }
}
