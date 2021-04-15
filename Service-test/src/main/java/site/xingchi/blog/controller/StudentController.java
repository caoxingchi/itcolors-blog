package site.xingchi.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.xingchi.blog.service.StudentService;
import site.xingchi.blog.utils.AjaxResult;

/**
 * @author xingchi -->> itcolors <<----
 * @version 1.0
 * @date 2021/4/6 15:54
 * @description
 */
@RestController
@RequestMapping("/student")
@Slf4j
//@CustomizeAnnotationLog
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/test")
    public AjaxResult setTest() {
        studentService.test();
        return AjaxResult.success();
    }


}
