package extends5override;

public class Test {
    public static void main(String[] args) {
        //目标：认识方法重写，再搞清楚场景
        //创建子类对象
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends  Animal {
    @Override//方法重写的校准注释（标志注解），要求方法名称和形参列表必须与被重写方法一致，否则报错
    //方法重写：方法名称，形参列表必须一样，这个方法就是方法重写。
    //猫觉得父类不符合自己的叫声，于是重写了一个方法让自己喵喵喵（所以子类也写了个cry覆盖父类方法）
    public void cry() {
        System.out.println("喵喵喵");
    }
}
class Animal {
    public void cry() {
        System.out.println("动物会叫~~~~~~~");
    }
}
