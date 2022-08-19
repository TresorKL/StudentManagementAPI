package com.example.studentmanagementapi.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String studentName;
    private String faculty;
    private String studentNum;

    public Student(Long id, String studentName, String faculty, String studentNum) {
        this.id = id;
        this.studentName = studentName;
        this.faculty = faculty;
        this.studentNum = studentNum;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", studentNum='" + studentNum + '\'' +
                '}';
    }
}
