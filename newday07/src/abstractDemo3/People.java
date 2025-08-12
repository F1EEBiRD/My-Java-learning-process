package abstractDemo3;

public abstract class People {
    //1.模板方法设计模式
    public void write(){
        System.out.println("\t\t\t 《我的爸爸》");
        System.out.println("\t 我爸爸是一个好人");
        writeMain();
        System.out.println("\t 我爸爸真好");
    }
    public abstract void writeMain();
}
