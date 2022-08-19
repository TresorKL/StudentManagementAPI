package com.example.studentmanagementapi.controller;

import com.example.studentmanagementapi.entity.Student;
import com.example.studentmanagementapi.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServiceInterface studentServiceInterface;


    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {


        return studentServiceInterface.createStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentServiceInterface.getAllStudents();
    }
}
