package AnnotantionDemo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})//表示注解的作用目标为方法，成员变量
@Retention(RetentionPolicy.RUNTIME)//表示注解的保留策略为编译器运行时（一直活着）
public @interface MyTest2 {
    String value();
    double price() default 100;
    String[] address();
}
