package com.example.studentmanagementapi.service;

import com.example.studentmanagementapi.entity.Student;

import java.util.List;


public interface StudentServiceInterface {

    public Student createStudent(Student student);

    public Student getStudentById(Long id);

    public List<Student> getAllStudents();

    public Student deleteStudent(Long id);

    public Student updateStudent(Long id);

}
