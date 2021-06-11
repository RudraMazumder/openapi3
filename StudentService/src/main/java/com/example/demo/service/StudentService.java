package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StudentRepository;
import com.example.demo.utility.StudentUtility;
import com.example.models.Student;



@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentDAO;
	
	public List<Student> getAllStudent(){
		 List<com.example.demo.repository.entities.Student> allStudent = studentDAO.findAll();
		 return allStudent.stream().map(StudentUtility::toStudentModel).collect(Collectors.toList());		 
	}
	
	public void saveStudent(Student student) {
		com.example.demo.repository.entities.Student studentEntity = StudentUtility.toStudentEntity(student);
		studentDAO.save(studentEntity);
	}
	
	public void deleteStudent(Integer id) {
		studentDAO.deleteById(id);
	}
	
	public Student getById(Integer id) {
		com.example.demo.repository.entities.Student student = studentDAO.getOne(id);
		return StudentUtility.toStudentModel(student);
	}
}
