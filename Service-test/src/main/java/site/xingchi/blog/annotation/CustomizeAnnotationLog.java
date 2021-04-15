package site.xingchi.blog.annotation;

import java.lang.annotation.*;

/**
 * @author xingchi -->> itcolors <<----
 * @version 1.0
 * @date 2021/4/6 15:26
 * @description 自定义注解 日志
 */

@Documented
@Target({ElementType.TYPE, ElementType.METHOD}) //注解所放的位置  此处为方法级别的注解
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomizeAnnotationLog {
    // String value() default "";
    // String name() default "";
}
