package com.anywhereworks.StudentApplication.servicesImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.anywhereworks.StudentApplication.entities.Student;
import com.anywhereworks.StudentApplication.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	List<Student> studentsList = new ArrayList<>(
			Arrays.asList(new Student(101, "Allen"), new Student(102, "Ben"), new Student(103, "Cathy")));

	@Override
	public List<Student> getAllStudents() {
		return studentsList;
	}

}
