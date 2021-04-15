package site.xingchi.blog.annotation;


import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD}) //注解所放的位置  此处为方法级别的注解
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomizeAnnotationTest {
    String value() default "";
}
