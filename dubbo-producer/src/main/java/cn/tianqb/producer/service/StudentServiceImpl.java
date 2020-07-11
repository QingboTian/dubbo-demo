package cn.tianqb.producer.service;

import cn.tianqb.consumer_interface.service.StudentService;
import cn.tianqb.pojo.Student;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author tianqb
 * @Mail tianqingbo@tianqb.cn
 * @Date 2020/7/11 14:51
 * @Version v1.0
 */
@Component
@Service(interfaceClass = StudentService.class, version = "0.0.1", timeout = 5000, retries = 1)
public class StudentServiceImpl implements StudentService {

    @Override
    public Student findStudentById(Integer id){
        // 测试超时
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Student(id, "张三", 1);
    }

}
