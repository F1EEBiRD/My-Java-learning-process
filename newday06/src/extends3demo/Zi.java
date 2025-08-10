package extends3demo;
import extends2demo.Fu;
public class Zi {
    public  class ZiFu extends Fu {
        public void show()
        {
            //privateMethod();
            //↓ 继承了父类等于同一个包中的类，子类
            protectedMethod();
            publicMethod();
            //↓只能同一个包中的类，子类不继承
            //method();
        }
    }

}
