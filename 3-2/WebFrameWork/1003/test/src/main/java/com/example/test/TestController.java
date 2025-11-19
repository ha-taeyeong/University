package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/hi")
	public String[] hi()
	{
		System.out.println("안내 스프링 부트.....");
		return new String[] {"Hello", "Spring Boot..."};
	}
}
