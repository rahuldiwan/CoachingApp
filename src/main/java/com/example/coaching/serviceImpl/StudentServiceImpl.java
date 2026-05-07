package com.example.coaching.serviceImpl;

import com.example.coaching.entity.Students;
import com.example.coaching.repository.StudentRepository;
import com.example.coaching.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    
	@Autowired
    private  StudentRepository studentRepository;

	@Override
	public Students addStudent(Students student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Students> getAllStudents() {
		
		return null;
	}

	@Override
	public Students getStudentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		
	}

   
}