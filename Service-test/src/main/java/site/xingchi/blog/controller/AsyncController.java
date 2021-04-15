package site.xingchi.blog.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.xingchi.blog.annotation.CustomizeAnnotationTest;
import site.xingchi.blog.synctask.SendEmailSyncTask;

/**
 * @author xingchi -->> itcolors <<----
 * @version 1.0
 * @date 2021/4/9 15:10
 * @description 异步任务处理
 */
@RestController
@CustomizeAnnotationTest("日志测试")
@RequestMapping("/async")
@Slf4j
public class AsyncController {
    @Autowired
    private SendEmailSyncTask sendEmailSyncTask;

    //    @CustomizeAnnotationLog("打印sendmail")
    @PostMapping("sendEmail")
    public String sendEmail() {
        log.info("sendEmail");
        return "成功";
    }


    @PostMapping("testEmail")
    public String testEmail() {
        log.info("testEmail");
        return "成功";
    }

}
