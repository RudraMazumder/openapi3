
package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.StudentApi;
import com.example.models.Student;





@RestController
public class StudentController implements StudentApi{
	
	
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private List<Student> students;
	

	@Override
	public ResponseEntity<List<Student>> studentGet(@Valid String studentname) {
		logger.info("Entered get operation");
		if(StringUtils.isEmpty(studentname)) {
			return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		}
		else {
			List<Student> studentsNameList = students.stream().filter(t->t.getStudentName().equalsIgnoreCase(studentname)).collect(Collectors.toList());
			
			if(!studentsNameList.isEmpty()) {
				return new ResponseEntity<List<Student>>(studentsNameList, HttpStatus.OK);
			}else {
				return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
			}
		}
	
	}

	@Override
	public ResponseEntity<Void> studentPost(@Valid Student body) {
		students.add(body);
		return null;
	}

	@Override
	public ResponseEntity<Void> studentIdDelete(Integer id) {
		logger.info("deleting student with id {}", id);
		students.removeIf(t->t.getStudentID().equals(id));
		return null;
	}

	@Override
	public ResponseEntity<Student> studentIdGet(Integer id) {
		Optional<Student> findFirst = students.stream().filter(t->t.getStudentID().equals(id)).findFirst();
		if(findFirst.isPresent()) {
			logger.info("Found student with id {}", id);
			return new ResponseEntity<Student>(findFirst.get(), HttpStatus.OK);
		}
		else {
			logger.info("Could not find student with id {}", id);
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}

	
	
	

}
