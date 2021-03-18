package com.automated.testing.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author reeedking
 * @date  2021/3/18
 * @description 学生实体类
 */
@Data
@Alias("Student")
public class Student {

    private String id;

    private String name;

    private int age;

    private String email;
}
