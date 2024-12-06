package com.example.jpaexample1.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaexample1.entities.StudentEntity;
import com.example.jpaexample1.services.StudentService;

@RequestMapping("/students1/")
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("all")
	public ArrayList<StudentEntity> getStudents(){
		return studentService.getAllStudents();
	}
}
