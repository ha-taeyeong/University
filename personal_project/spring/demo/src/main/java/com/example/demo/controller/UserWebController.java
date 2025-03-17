package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserWebController {

    @Autowired
    private UserService userService;

    // 사용자 목록 조회
    @GetMapping
    public String getUsers(Model model) {
        // 사용자 목록을 DB에서 가져와서 Model에 담기
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users); // 사용자 목록을 "users"라는 이름으로 JSP에 전달
        return "userList"; // userList.jsp를 반환
    }

    // 사용자 추가 폼
    @GetMapping("/add")
    public String addUserForm() {
        return "insert"; // insert.jsp
    }

    // 사용자 추가 처리
    @PostMapping("/add")
    public String addUser(@RequestParam String name, @RequestParam int age) {
        userService.addUser(name, age);
        return "redirect:/users"; // 추가 후 목록으로 리디렉션
    }

    // 사용자 수정 폼
    @GetMapping("/update/{id}")
    public String updateUserForm(@PathVariable int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "update"; // update.jsp
    }

    // 사용자 수정 처리
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable int id, @RequestParam String name, @RequestParam int age) {
        userService.updateUser(id, name, age);
        return "redirect:/users"; // 수정 후 목록으로 리디렉션
    }

    // 사용자 삭제 폼
    @GetMapping("/delete/{id}")
    public String deleteUserForm(@PathVariable int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "delete"; // delete.jsp
    }

    // 사용자 삭제 처리
    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.removeUser(id);
        return "redirect:/users"; // 삭제 후 목록으로 리디렉션
    }
}



