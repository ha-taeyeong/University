package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/do")
	public String hello() {
		return "Hello from WebApplicationContext!";
	}
	
}
