package com.example.StudentManagementApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementApi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // This interface will automatically provide CRUD operations for Student
    // You can add custom query methods here if needed

}
