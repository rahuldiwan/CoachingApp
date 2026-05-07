package com.example.coaching.service;

import com.example.coaching.entity.Students;

import java.util.List;

public interface StudentService {

    Students addStudent(Students student);

    List<Students> getAllStudents();

    Students getStudentById(Long id);

    void deleteStudent(Long id);
}