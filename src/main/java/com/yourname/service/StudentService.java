package com.yourname.service;

import com.yourname.dao.StudentDao;
import com.yourname.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by samuelratemo on 3/25/17.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

}
