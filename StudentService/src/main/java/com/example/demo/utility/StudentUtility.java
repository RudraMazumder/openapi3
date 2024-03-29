package com.example.demo.utility;

import javax.validation.Valid;

import com.example.demo.repository.entities.AddressEntity;
import com.example.demo.repository.entities.CourseEntity;
import com.example.demo.repository.entities.StudentEntity;
import com.example.models.Course;
import com.example.models.Student;
import com.example.models.StudentAddress;

public class StudentUtility {
	
	private StudentUtility() {
		    throw new IllegalStateException("Utility class");
	}
	
	public static Student toStudentModel(StudentEntity student) {
		Student studentModel = new Student();
		studentModel.setStudentID(student.getStudentId());
		studentModel.setStudentName(student.getStudentName());
		studentModel.setAge(student.getAge());
		studentModel.setGroupID(student.getGroupId());
		
		StudentAddress address = new StudentAddress();
		
		
		AddressEntity addressEntity = student.getAddress();
		
		
		if (addressEntity!=null) {
			address.setCity(addressEntity.getCity());
			address.setHouseNumber(addressEntity.getHouseNumber());
			address.setStreetName(addressEntity.getStreet());
		}
		studentModel.setAddress(address);
		
		return studentModel;
		
	}
	
	public static StudentEntity toStudentEntity(Student student){
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setAge(student.getAge());
		studentEntity.setStudentName(student.getStudentName());
		if(student.getStudentID()!=null)
			studentEntity.setStudentId(student.getStudentID());
		studentEntity.setGroupId(student.getGroupID());
		AddressEntity addressEntity = new AddressEntity();

		StudentAddress address = student.getAddress();
		if(address!=null) {
			addressEntity.setCity(address.getCity());
			addressEntity.setHouseNumber(address.getHouseNumber());
			addressEntity.setStreet(address.getStreetName());
		}
		
		
		studentEntity.setAddress(addressEntity);
		
		return studentEntity;
		
	}
	
	public static Course toCourseModel(CourseEntity courseEntity) {
		Course course= new Course();
		course.setCourseUID(courseEntity.getCourseId());
		course.setCourseFee(courseEntity.getCourseFee());
		course.setCourseName(courseEntity.getCourseName());
		
		return course;
	}
	
	public static CourseEntity toCourseEntity(Course course) {
		CourseEntity entity= new CourseEntity();
		entity.setCourseFee(course.getCourseFee());
		entity.setCourseId(course.getCourseUID());
		entity.setCourseName(course.getCourseName());
		return entity;
		
	}

}
