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

    // Create User
    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        int result = userService.createUser(user);
        return result > 0 ? ResponseEntity.ok("User created successfully") : ResponseEntity.status(400).body("Error creating user");
    }

    // Get all Users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get User by ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    // Update User
    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        int result = userService.updateUser(user);
        return result > 0 ? ResponseEntity.ok("User updated successfully") : ResponseEntity.status(400).body("Error updating user");
    }

    // Delete User
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        int result = userService.deleteUser(id);
        return result > 0 ? ResponseEntity.ok("User deleted successfully") : ResponseEntity.status(400).body("Error deleting user");
    }
}
