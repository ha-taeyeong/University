package com.example.myproject.controller;

import com.example.myproject.model.User;
import com.example.myproject.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        userService.insertUser(user);
        return "redirect:/users/select";
    }
    
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model) {
        User user = userService.getUser(id);  // getUser() 메소드가 있어야 합니다.
        model.addAttribute("user", user);
        return "update";  // update.jsp로 이동
    }

    // Update user
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable int id, @ModelAttribute User user) {
        user.setId(id); // 사용자 ID 설정
        userService.updateUser(user); // 서비스에서 업데이트
        return "redirect:/users/select"; // 수정 후 사용자 목록 페이지로 리디렉션
    }

    // Delete user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/users/select";
    }

    // Select all users
    @GetMapping("/select")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "select";
    }

 // 이름으로 검색
    @GetMapping("/searchByName")
    public String searchUsersByName(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null || name.isEmpty()) {
            return "redirect:/users/select";  // 이름이 없으면 목록 페이지로 리디렉션
        }
        List<User> users = userService.getUsersByName(name);  // 이름으로 사용자 검색
        model.addAttribute("users", users);  // 모델에 검색된 사용자 리스트 추가
        return "select";  // select.jsp 페이지로 이동
    }

    // 이메일로 검색
    @GetMapping("/searchByEmail")
    public String searchUsersByEmail(@RequestParam(value = "email", required = false) String email, Model model) {
        if (email == null || email.isEmpty()) {
            return "redirect:/users/select";  // 이메일이 없으면 목록 페이지로 리디렉션
        }
        List<User> users = userService.getUsersByEmail(email);  // 이메일로 사용자 검색
        model.addAttribute("users", users);  // 모델에 검색된 사용자 리스트 추가
        return "select";  // select.jsp 페이지로 이동
    }
}
