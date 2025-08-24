package AnnotantionDemo3;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Arrays;

public class AnnotationDemo3 {
        //目标：解析注解
     @Test
    public void parseClass() throws Exception {
         //1.获取类对象
         Class c1 = Demo.class;
         //2.判断这个类上是否成列了注解MyTest2
         if (c1.isAnnotationPresent(MyTest2.class)) {
             //3.获取注解对象
             MyTest2 myTest2 = (MyTest2) c1.getDeclaredAnnotation(MyTest2.class);
             //4.获取注解的属性值
             String[] address = myTest2.address();
             double price = myTest2.price();
             String value = myTest2.value();

             //5.打印属性值
             System.out.println(Arrays.toString(address));
             System.out.println(price);
             System.out.println(value);
             System.out.println("------------------------------------------------");

         }
     }

     @Test
    public void parseMethod() throws Exception {
         //1.获取类对象
          Class c1 = Demo.class;
          //2.获取方法对象
          Method method = c1.getMethod("go");
          //3.判断这个方法上是否有注解MyTest2
          if(method.isAnnotationPresent(MyTest2.class)){
              //4.获取注解对象
              MyTest2 myTest2 = method.getDeclaredAnnotation(MyTest2.class);
              //5.获取注解的属性值
              String[] address = myTest2.address();
              double price = myTest2.price();
              String value = myTest2.value();
              //6.打印属性值
              System.out.println(Arrays.toString(address));
              System.out.println(price);
              System.out.println(value);
          }


     }

}

