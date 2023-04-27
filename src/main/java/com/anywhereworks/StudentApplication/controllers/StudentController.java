package com.anywhereworks.StudentApplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anywhereworks.StudentApplication.entities.Student;
import com.anywhereworks.StudentApplication.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentsList")
	public ResponseEntity<Student> getAllStudents() {
		List<Student> studentsList = studentService.getAllStudents();
		return new ResponseEntity(studentsList,HttpStatus.OK);
	}
}
