package com.spring.service;

import java.util.List;

import com.spring.api.Student;

public interface StudentService {
	
	List<Student> loadStudents();

	void savedStudent(Student student);

}
