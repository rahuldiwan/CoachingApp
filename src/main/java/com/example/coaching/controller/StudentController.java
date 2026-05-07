package com.example.coaching.controller;


import com.example.coaching.entity.Students;
import com.example.coaching.service.StudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@CrossOrigin("*")
public class StudentController {
    
	@Autowired
    private  StudentService studentService;

    @PostMapping
    public Students addStudent(@RequestBody Students student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Students> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student Deleted Successfully";
    }
}