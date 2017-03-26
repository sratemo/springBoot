package com.yourname.dao;

import com.yourname.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by samuelratemo on 3/25/17.
 */

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {

            {
                put(1, new Student(1, "Sammy", "Computer Science"));
                put(2, new Student(2, "Julius", "Mathematics"));
                put(3, new Student(3, "Ratemo", "Business"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
}