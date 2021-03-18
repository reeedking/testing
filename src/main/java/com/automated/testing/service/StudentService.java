package com.automated.testing.service;

import com.automated.testing.model.Student;

import java.util.List;

/**
 * @author reeedking
 * @date  2021/3/18
 */
public interface StudentService {

    /**
     * 通过学生id获取学生信息
     * @author reeedking
     * @param id 学生id
     * @return Student
     */
    Student getStudentById(String id);

    /**
     * 获取所有学生信息
     * @author reeedking
     * @return List
     */
    List<Student> getStudents();

    /**
     * 添加学生信息
     * @author reeedking
     * @param student student
     * @return int
     */
    int insertStudent(Student student);

    /**
     * 修改学生信息
     * @author reeedking
     * @param student student
     */
    int updateStudent(Student student);

    /**
     *
     * @author reeedking
     * @param id 学生id
     * @return int
     */
    int deleteStudentById(String id);
}
