package site.xingchi.blog.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import site.xingchi.blog.annotation.CustomizeAnnotationTest;

@Aspect
@Component
public class MyTestAspect {
    //within(site.xingchi.blog.controller.*.*(..))
    @Pointcut("@within(customizeAnnotationTest)")
    public void annotationPointCut(CustomizeAnnotationTest customizeAnnotationTest) {
    }

    @Around("annotationPointCut(customizeAnnotationTest)")
    public Object LogMyLog(ProceedingJoinPoint point, CustomizeAnnotationTest customizeAnnotationTest) throws Throwable {
        String value = customizeAnnotationTest.value();
        System.out.println("before自定义日志[" + value + "]");
        Object proceed = point.proceed();
        //System.out.println("after自定义日志[" +value + "]");
        return proceed;
    }
}
