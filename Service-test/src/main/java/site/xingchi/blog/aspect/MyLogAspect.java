package site.xingchi.blog.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import site.xingchi.blog.annotation.CustomizeAnnotationLog;

@Aspect
@Component
public class MyLogAspect {
    //within(site.xingchi.blog.controller.*.*(..))
    @Pointcut("@annotation(customizeAnnotationLog)")
    public void annotationPointCut(CustomizeAnnotationLog customizeAnnotationLog) {
    }

    @Around("annotationPointCut(customizeAnnotationLog)")
    public Object LogMyLog(ProceedingJoinPoint point, CustomizeAnnotationLog customizeAnnotationLog) throws Throwable {
        //MethodSignature signature = (MethodSignature) point.getSignature();
        //Method method = signature.getMethod();
        //CustomizeAnnotationLog customizeAnnotationLog = method.getAnnotation(CustomizeAnnotationLog.class);
        //String value = customizeAnnotationLog.value();
        System.out.println("before自定义日志[" + "]");
        Object proceed = point.proceed();
        System.out.println("after自定义日志[" + "]");
        return proceed;
    }
}
