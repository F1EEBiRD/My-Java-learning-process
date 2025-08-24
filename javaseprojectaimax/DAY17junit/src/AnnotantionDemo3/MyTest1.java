package AnnotantionDemo3;

import java.lang.annotation.*;

//@Target({ElementType.METHOD,ElementType.FIELD})//表示注解的作用目标为方法，属性
@Retention(RetentionPolicy.RUNTIME)//表示注解的保留策略为编译器运行时（一直活着）
public @interface MyTest1 {
}
