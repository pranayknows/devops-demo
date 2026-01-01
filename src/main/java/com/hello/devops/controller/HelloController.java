package com.hello.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/devops")
	public String greetDevops() {
		return "Hello from Spring Boot + Docker + Jenkins";
	}
}
