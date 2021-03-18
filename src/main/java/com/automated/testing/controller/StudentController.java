package com.automated.testing.controller;

import com.automated.testing.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author reeedking
 * @date  2021/3/18
 * @description 
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping
    public Object getDemo(){
        return "test get request";
    }

    @PostMapping
    public Object postDemo(){
        return "test post request";
    }

    @PutMapping
    public Object putDemo(){
        return "test put request";
    }

    @DeleteMapping
    public Object deleteDemo(){
        return "test delete request";
    }
}
