package com.example.myproject.controller;

import com.example.myproject.dto.User;
import com.example.myproject.security.JwtUtil;
import com.example.myproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    private final UserService userService;
    private final JwtUtil jwtUtil;

    public UserRestController(UserService userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    private String getUserIdFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            String token = bearerToken.substring(7);
            return jwtUtil.extractUserId(token);
        }
        return null;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user, HttpServletRequest request) {
        String regId = user.getUserId();
        String regIp = request.getRemoteAddr();
        String delYn = "N"; // 기본값
        int result = userService.createUser(user, regId, regIp, delYn);
        return result > 0
            ? ResponseEntity.ok("User created successfully")
            : ResponseEntity.status(400).body("Error creating user");
    }

    @PutMapping("/{userNo}")
    public ResponseEntity<String> updateUser(@PathVariable int userNo, @RequestBody User user, HttpServletRequest request) {
        user.setUserNo(userNo);
        String modId = getUserIdFromRequest(request); // JWT에서 추출
        if (modId == null) {
            return ResponseEntity.status(401).body("Invalid or missing JWT token");
        }
        String modIp = request.getRemoteAddr();
        int result = userService.updateUser(user, modId, modIp);
        return result > 0 ?
                ResponseEntity.ok("User updated successfully")
                : ResponseEntity.status(400).body("Error updating user");
    }

    @DeleteMapping("/{userNo}")
    public ResponseEntity<String> deleteUser(@PathVariable int userNo, HttpServletRequest request) {
        User user = new User();
        user.setUserNo(userNo);
        String modId = getUserIdFromRequest(request); // JWT에서 추출
        if (modId == null) {
            return ResponseEntity.status(401).body("Invalid or missing JWT token");
        }
        String modIp = request.getRemoteAddr();
        String delYn = "Y"; // 기본값
        int result = userService.deleteUser(user, modId, modIp, delYn);
        return result > 0 ?
                ResponseEntity.ok("User updated successfully")
                : ResponseEntity.status(400).body("Error deleting user");
    }

    @DeleteMapping("/permanent/{userNo}")
    public ResponseEntity<String> deleteUserPermanently(@PathVariable int userNo) {
        int result = userService.deleteUserPermanently(userNo);
        return result > 0 ?
                ResponseEntity.ok("User updated successfully")
                : ResponseEntity.status(400).body("Error permanent deleting user");
    }

    @GetMapping("/me")
    public ResponseEntity<User> getMyInfo(Authentication authentication) {
        String userId = (String) authentication.getPrincipal();
        User user = userService.findByUserId(userId);
        return ResponseEntity.ok(user);
    }

}
