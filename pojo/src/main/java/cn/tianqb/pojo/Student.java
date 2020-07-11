package cn.tianqb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author tianqb
 * @Mail tianqingbo@tianqb.cn
 * @Date 2020/7/11 15:26
 * @Version v1.0
 */
@Data
@AllArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer gender;
}