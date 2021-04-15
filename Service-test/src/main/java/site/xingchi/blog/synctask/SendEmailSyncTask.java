package site.xingchi.blog.synctask;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@EnableAsync
@Component
@Slf4j
public class SendEmailSyncTask {

    /**
     * @author -->> itcolors <<----
     * @time 16:19
     * @description 异步处理发送邮件
     */
    @Async
    @SneakyThrows //异常的处理注解

    public void runSendEmail() {
        log.info("开始异步发送邮件操作");
        Thread.sleep(5000);
    }
}
