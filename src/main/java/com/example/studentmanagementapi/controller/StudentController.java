package com.example.studentmanagementapi.controller;

import com.example.studentmanagementapi.entity.Student;
import com.example.studentmanagementapi.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/student/{id}")
    public Student getStudent (@PathVariable("id") Long id){

        return  studentServiceInterface.getStudentById(id).get();


    }
}
