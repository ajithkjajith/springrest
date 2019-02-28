package com.accenture.spring.demo.config.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.spring.demo.config.bean.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> studentList;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return studentList;
	}
	
	@PostConstruct
	public void load() {
		studentList = new ArrayList<Student>();
		studentList.add(new Student("Naveen","Kumar"));
		studentList.add(new Student("ABC","DEF"));
		studentList.add(new Student("MNO","PQR"));
		studentList.add(new Student("UVW","XYZ"));
		
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return studentList.get(studentId);
	}
	
	
}



