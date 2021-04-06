package site.xingchi.blog.servicebase.exceptionHandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import site.xingchi.blog.servicebase.exception.MyException;
import site.xingchi.blog.utils.AjaxResult;


/**
 *@author  xingchi -->> itcolors <<----
 *@date  2021/4/3 22:43
 *@version 1.0
 *@description 全局异常捕获
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResult error(Exception e){
        log.error(e.getMessage());
        e.printStackTrace();
        return AjaxResult.error("执行了全局异常");
    }


    @ExceptionHandler(MyException.class)
    @ResponseBody
    public AjaxResult error(MyException e){
        log.error(e.getMsg());
        e.printStackTrace();
        return AjaxResult.error(e.getCode(),e.getMsg());
    }


}
