package com.example.demo.utility;

import com.example.models.Student;

public class StudentUtility {
	
	private StudentUtility() {
		    throw new IllegalStateException("Utility class");
	}
	
	public static Student toStudentModel(com.example.demo.repository.entities.Student student) {
		Student studentModel = new Student();
		studentModel.setStudentID(student.getStudentId());
		studentModel.setStudentName(student.getStudentName());
		studentModel.setStudentRemark(student.getRemarks());
		return studentModel;
		
	}
	
	public static com.example.demo.repository.entities.Student toStudentEntity(Student student){
		com.example.demo.repository.entities.Student studentEntity = new com.example.demo.repository.entities.Student();
		studentEntity.setAge(10);
		studentEntity.setRemarks(student.getStudentRemark());
		studentEntity.setStudentName(student.getStudentName());
		if(student.getStudentID()!=null)
			studentEntity.setStudentId(student.getStudentID());
		return studentEntity;
		
	}

}
