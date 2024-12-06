package com.example.jpaexample1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpaexample1.entities.StudentEntity;
import com.example.jpaexample1.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public ArrayList<StudentEntity> getAllStudents(){
		return  (ArrayList<StudentEntity>) studentRepository.findAll();
		
	}
}
