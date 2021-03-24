package com.example.api;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Student;

public class TestClass {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		Student student1 = new Student();
		student1.setStudentID(123);
		student1.setStudentName("Rudra");
		student1.setStudentRemark("Remark1");

		Student student2 = new Student();
		student2.setStudentID(234);
		student2.setStudentName("Arun");
		student2.setStudentRemark("Remark2");

		Student student3 = new Student();
		student3.setStudentID(345);
		student3.setStudentName("Arun");
		student3.setStudentRemark("Remark3");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		students.forEach(t->System.out.println(t.getStudentName()));
		
		students.removeIf(t->t.getStudentID()==345);
		
		
		System.out.println("After removal of 345");
		students.forEach(t->System.out.println(t.getStudentName()));
		

	}

}