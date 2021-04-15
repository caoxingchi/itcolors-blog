package site.xingchi.blog.service.impl;

import org.springframework.stereotype.Service;
import site.xingchi.blog.annotation.CustomizeAnnotationLog;
import site.xingchi.blog.service.StudentService;

@Service
@CustomizeAnnotationLog
public class StudentServiceImpl implements StudentService {

    @Override
    public void test() {
        System.out.println("test");
    }
}
