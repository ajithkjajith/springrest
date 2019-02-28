package com.accenture.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.springdemo.pojo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		Student student=new Student();
		theModel.addAttribute(student);
		return"student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute
			("student")Student theStudent)
	{
		System.out.println("theStudent"+
	theStudent.getFirstName()+
	theStudent.getLastName());
		
		return"student-confirmation";
		
	}
}
