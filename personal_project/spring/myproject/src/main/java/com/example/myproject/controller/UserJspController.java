package com.example.myproject.controller;

import com.example.myproject.model.User;
import com.example.myproject.service.UserService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserJspController {

    private final UserService userService;

    public UserJspController(UserService userService) {
        this.userService = userService;
    }

    // Insert page
    @GetMapping("/insert")
    public String showInsertForm() {
        return "insert"; // insert.jsp
    }

    // Insert user
    @PostMapping("/insert")
    public String insertUser(User user) {
        userService.createUser(user);
        return "redirect:/users/select";
    }

    // Update page
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "update"; // update.jsp
    }

    // Update user
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable int id, User user) {
        user.setUserNo(id);
        userService.updateUser(user);
        return "redirect:/users/select";
    }

    // Delete user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/users/select";
    }

    // Select users
    @GetMapping("/select")
    public String getAllUsers(Model model) {
    	List<User> users = userService.getAllUsers();
        System.out.println("Users from DB: " + users);  // 로그 추가
        model.addAttribute("users", users);
        return "select";
    }
}
