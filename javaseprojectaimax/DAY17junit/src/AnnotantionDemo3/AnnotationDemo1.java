package AnnotantionDemo3;


@MyBook(name="田中",age=20,address={"北京 ","上海"})
//@A(value = "c++")
//@A("c++")//特殊属性value，在使用时如果只有一个属性，可以省略value
//@A(value ="c++" , hobby = "睡觉")
@A(value = "delete")//在使用时如果只有一个属性，可以省略value,如果另一个属性有默认值，可以省略

public class AnnotationDemo1 {
    @MyBook(name="java",age=18,address={"北京","上海"})
    public static void main( @A("java")  String[] arg) {
        //目标：自定义注解



    }
}
