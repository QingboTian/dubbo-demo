package cn.tianqb.consumer.controller;

import cn.tianqb.consumer_interface.service.StudentService;
import cn.tianqb.pojo.Student;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author tianqb
 * @Mail tianqingbo@tianqb.cn
 * @Date 2020/7/11 14:56
 * @Version v1.0
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Reference(version = "0.0.1")
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.findStudentById(id);
    }

}
