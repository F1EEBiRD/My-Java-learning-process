package AnnotantionDemo3;

public @interface A {
    String value();//特殊属性，在使用时如果只有一个value属性，可以省略value
    String hobby() default "吃饭";
}

