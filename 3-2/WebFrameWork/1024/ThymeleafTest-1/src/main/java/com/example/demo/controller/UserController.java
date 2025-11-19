package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {
	
	private List<String> userList = new ArrayList<>();
	
	@GetMapping("/users")
	public String getUsers(Model model) {
		model.addAttribute("userList", userList);
		model.addAttribute("title", "사용자 목록");
		return "users";
	}
	
	@GetMapping("/users/new")
	public String showForm(Model model) {
		model.addAttribute("title", "회원 등록");
		return "user-form";
	}
	
	@PostMapping("/users")
	public String addUser(@RequestParam String name) {
		userList.add(name);
		return "redirect:/users";
	}
}
