package com.accenture.spring.demo.config.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hi there!";
	}
	
	@PostMapping("/helloagain")
	public String sayHelloAgain() {
		return "Hello Again!";
	}
	
	@PostMapping("/checkargs")
	public int testArgs(@RequestParam int a, @RequestParam int b) {
		return a - b;
	}

}
