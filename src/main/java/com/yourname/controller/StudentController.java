package com.yourname.controller;

import com.yourname.entity.Student;
import com.yourname.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by samuelratemo on 3/25/17.
 */

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)

    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
