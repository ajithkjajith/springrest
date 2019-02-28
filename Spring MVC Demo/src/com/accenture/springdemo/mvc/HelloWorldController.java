package com.accenture.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";	
	}
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTWo(HttpServletRequest request,Model model)
	{
		String theStudent=request.getParameter("studentname");
		theStudent=  theStudent.toUpperCase();
		String result ="Hello"+theStudent;
		System.out.println(result);
		model.addAttribute("message",result);
		return "helloworld";
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentname")String 
			theStudent,Model model)
	{
		theStudent=  theStudent.toUpperCase();
		String result ="Hello"+theStudent;
		System.out.println(result);
		model.addAttribute("message",result);
		return "helloworld";
	}
}
