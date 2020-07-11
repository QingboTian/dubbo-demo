package cn.tianqb.consumer_interface.service;

import cn.tianqb.pojo.Student;

/**
 * @Description:
 * @Author tianqb
 * @Mail tianqingbo@tianqb.cn
 * @Date 2020/7/11 15:24
 * @Version v1.0
 */
public interface StudentService {
    public Student findStudentById(Integer id);
}
