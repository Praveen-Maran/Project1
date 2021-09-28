package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.DataDAO;
import com.spring.api.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private DataDAO dataDAO;
	
	@Override
	public List<Student> loadStudents() {
		
		List<Student> studentList = dataDAO.loadData();
		return studentList;
	}

	@Override
	public void savedStudent(Student student) {
		
		if(student.getDept().equals("CSE")) {
			System.out.println("This student is cse department");
		}
		dataDAO.savedStudent(student);
		
	}

}
