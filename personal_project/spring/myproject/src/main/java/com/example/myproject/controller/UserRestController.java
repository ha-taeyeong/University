package com.example.myproject.controller;

import com.example.myproject.model.User;
import com.example.myproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        int result = userService.createUser(user);
        return result > 0 ? ResponseEntity.ok("User created successfully") : ResponseEntity.status(400).body("Error creating user");
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userNo}")
    public User getUser(@PathVariable int userNo) {
        return userService.getUser(userNo);
    }

    @PutMapping("/{userNo}")
    public ResponseEntity<String> updateUser(@PathVariable int userNo, @RequestBody User user) {
        user.setUserNo(userNo);
        int result = userService.updateUser(user);
        return result > 0 ? ResponseEntity.ok("User updated successfully") : ResponseEntity.status(400).body("Error updating user");
    }

    @DeleteMapping("/{userNo}")
    public ResponseEntity<String> deleteUser(@PathVariable int userNo) {
        int result = userService.deleteUser(userNo);
        return result > 0 ? ResponseEntity.ok("User deleted successfully") : ResponseEntity.status(400).body("Error deleting user");
    }
}
