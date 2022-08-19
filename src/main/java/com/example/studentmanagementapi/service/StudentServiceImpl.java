package com.example.studentmanagementapi.service;

import com.example.studentmanagementapi.entity.Student;
import com.example.studentmanagementapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {


        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student deleteStudent(Long id) {
        return null;
    }

    @Override
    public Student updateStudent(Long id) {
        return null;
    }
}
