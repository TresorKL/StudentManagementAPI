package com.example.studentmanagementapi.service;

import com.example.studentmanagementapi.entity.Student;
import com.example.studentmanagementapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {


        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Long id) {


        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public String deleteStudent(Long id) {

        String response = null;
        Optional<Student> optionalStudent = studentRepository.findById(id);


        if (optionalStudent.isPresent()) {
            Student student = studentRepository.findById(id).get();
            studentRepository.delete(student);
            response = "Student successfully deleted";
        } else {
            response = "Opps Student not found";
        }

        return response;
    }

    @Override
    public Student updateStudent(Long id, Student student) {



       Student studentFound=studentRepository.findById(id).get();


            if (Objects.nonNull(student.getStudentNum())&&!student.getStudentNum().equals("")) {
                studentFound.setStudentNum(student.getStudentNum());
            }
            if (Objects.nonNull(student.getStudentName())&&!student.getStudentName().equals("")) {
                studentFound.setStudentName(student.getStudentName());
            }
            if (Objects.nonNull(student.getFaculty())&&!student.getFaculty().equals("")) {
                studentFound.setFaculty(student.getFaculty());
            }



        return  studentRepository.save(studentFound);
    }
}
