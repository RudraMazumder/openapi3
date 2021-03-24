package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.models.Student;

@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
	
	
	@Bean(name="students")
	public List<Student> getAllStudents(){
		
		List<Student> students = new ArrayList<Student>();
		
		Student student1=new Student();
		student1.setStudentID(123);
		student1.setStudentName("Rudra");
		student1.setStudentRemark("Remark1");
		

		Student student2=new Student();
		student2.setStudentID(234);
		student2.setStudentName("Arun");
		student2.setStudentRemark("Remark2");
		
		Student student3=new Student();
		student3.setStudentID(345);
		student3.setStudentName("Arun");
		student3.setStudentRemark("Remark3");
		
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;
	}

}
