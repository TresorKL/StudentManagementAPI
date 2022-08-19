package com.example.studentmanagementapi.repository;

import com.example.studentmanagementapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
