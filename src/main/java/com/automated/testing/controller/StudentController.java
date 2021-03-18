package com.automated.testing.controller;

import com.automated.testing.model.Student;
import com.automated.testing.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author reeedking
 * @date 2021/3/18
 * @description
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    public List<Student> listStudents() {
        return studentService.getStudents();
    }


    @PostMapping
    public int insertStudent(@RequestBody Student student) {
        return studentService.insertStudent(student);
    }

    @PutMapping
    public int updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public int deleteStudent(@PathVariable String id) {
        return studentService.deleteStudentById(id);
    }
}
