package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.DAO.DataDAO;
import com.spring.api.Student;


@Controller
public class FirstController {

	@Autowired
	private DataDAO DataDAO;

	// @RequestMapping(value = "/showData", method = RequestMethod.GET)
	@GetMapping("/showData")
	public String showDataList(Model model) {

		List<Student> studentList = DataDAO.loadData();

		model.addAttribute("students", studentList);

		return "data-list";
	}
	
	@GetMapping("/addStudent")
	public String addStudent(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "addStudent";
	}
}
