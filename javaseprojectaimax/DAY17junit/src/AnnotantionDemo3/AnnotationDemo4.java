package AnnotantionDemo3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    public static void main(String[] args) throws Exception{
        //目标：搞清楚注解的应用场景，模拟JUnit框架。有MyTest注解的方法就执行，没有的就不执行
        AnnotationDemo4 ad4 = new AnnotationDemo4();
        //1.获取类对象
        Class c = AnnotationDemo4.class;
        //2.获取所有方法
        Method[] methods = c.getMethods();
        //3.遍历所有方法，判断方法上是否有MyTest注解，如果有就执行，没有的就不执行
        for (Method method : methods) {
            //4.判断这个方法上是否有MyTest注解
            if(method.isAnnotationPresent(MyTest.class)){
                //获取到这个方法的注解
                MyTest myTest = method.getAnnotation(MyTest.class);
                int count = myTest.count();
                //5.执行方法
                for (int i = 0; i < count; i++) {
                    method.invoke(ad4);
                }

            }
        }


    }
    @MyTest
    public void test1(){
        System.out.println("test1已执行");
    }

    public void test2(){
        System.out.println("test2已执行");
    }

    @MyTest(count = 5)
    public void test3(){
        System.out.println("test3已执行");
    }

    public void test4(){
        System.out.println("test4已执行");
    }
}
