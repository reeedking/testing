package com.automated.testing.service.impl;

import com.automated.testing.mapper.StudentMapper;
import com.automated.testing.model.Student;
import com.automated.testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author reeedking
 * @date  2021/3/18
 * @description
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    
    @Override
    public Student getStudentById(String id) {
        Student student = new Student();
        student.setId("1");
        student.setName("wh");
        return student;
    }

    @Override
    public List<Student> getStudents() {
        return studentMapper.selectList(null);
    }

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudentById(String id) {
        return 0;
    }

}
