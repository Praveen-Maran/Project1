package com.spring.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
//	@RequestMapping(value = "/showData",method = RequetMethod.GET)
	@GetMapping("/showData")
	public String showData() {
		return "data-list";
	}

}
