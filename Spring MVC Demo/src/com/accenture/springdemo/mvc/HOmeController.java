package com.accenture.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HOmeController {
@RequestMapping("/")
	public String showPage()
	{
	System.out.println("Sample");
		return "main-menu";
	}
}
