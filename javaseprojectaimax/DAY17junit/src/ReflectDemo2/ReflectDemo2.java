package ReflectDemo2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    @Test
    public void getClassInfo() {
        //目标：获取类的信息
        //1.反射第一步：获取Class对象，代表拿到类
        Class c1 = Student.class;
        System.out.println(c1.getName() );//类的全类名 包名+类名
        System.out.println(c1.getSimpleName());//类名

        //2.获取类的构造器对象并对其进行操作


    }
    @Test
    public void getConstructorInfo() throws Exception {
        //1.反射第一步：获取Class对象，代表拿到类
        Class c1 = Cat.class;
        //2.获取构造器对象并进行操作
        Constructor[] cons = c1.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName() + "( " + con.getParameterCount()  +")");
        }
        //3.获取单个构造器
        Constructor con = c1.getDeclaredConstructor();//获取无参构造器
        System.out.println(con.getName() + "( " + con.getParameterCount()  +")");

        Constructor con2 = c1.getDeclaredConstructor(String.class, int.class);//2个参数的有参构造器
        System.out.println(con2.getName() + "( " + con2.getParameterCount()  +")");

        //4.获取构造器的作用依然是创建对象：创建对象。
        //暴力反射：暴力反射可以访问私有成员变量和私有成员方法
        con.setAccessible(true);//绕过访问权限，直接访问！
        Cat m1 = (Cat)con.newInstance();
        System.out.println(m1);

        Cat m2 = (Cat)con2.newInstance("Tom", 5);
        System.out.println(m2);
    }

    //3.获取成员变量对象并操作
    @Test
    public void getFieldInfo() throws Exception {
        //1.反射第一步：获取Class对象，代表拿到类
        Class c1 = Cat.class;
        //2.获取成员变量对象并操作
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "（" + field.getType().getName() + "）");
        }
        //3.获取单个成员变量对象并操作
        Field field = c1.getDeclaredField("name");
        System.out.println(field.getName() + "（" + field.getType().getName() + "）");

        Field field2 = c1.getDeclaredField("hobby");
        System.out.println(field2.getName() + "（" + field2.getType().getName() + "）");

        //4.获取成员变量对象的目的依然是取值和赋值
        Cat c = new Cat("汤姆",4);
        field2.setAccessible(true);
        field2.set(c,"睡觉");//c.setHobby("睡觉");
        System.out.println(c);

        String hobby =( String) field2.get(c);//c.getHobby();
        System.out.println(hobby);
    }

    //4.获取类的成员方法对象并对其进行操作。
    @Test
    public void getMethodInfo() throws Exception {
        //1.反射第一步：获取Class对象，代表拿到类
        Class c1 = Cat.class;
        //2.获取成员方法对象
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        }

        //3.获取单个成员方法对象
        Method eat1 = c1.getDeclaredMethod("eat");//获取无参的eat方法
        Method eat2 = c1.getDeclaredMethod("eat", String.class);//获取有参的eat方法
        System.out.println(eat1.getName() + "(" + eat1.getParameterCount() + ")");
        System.out.println(eat2.getName() + "(" + eat2.getParameterCount() + ")");

        //4.获取成员方法对象，目的依然是调用成员方法
        Cat c = new Cat("汤姆",4);
        eat1.setAccessible(true);
        Object rs1 = eat1.invoke(c);//唤醒对象d的eat无参方法执行，相当于c.eat();
        System.out.println(rs1);//null

        Object rs2 = eat2.invoke(c, "罐头");//唤醒对象d的eat带string方法执行，相当于c.eat("罐头");
        System.out.println(rs2);


    }

}
