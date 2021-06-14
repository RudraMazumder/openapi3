package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.repository.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

	
}
