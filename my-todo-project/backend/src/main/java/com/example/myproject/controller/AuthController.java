package com.example.myproject.controller;

import com.example.myproject.dto.LoginRequest;
import com.example.myproject.dto.User;
import com.example.myproject.security.JwtUtil;
import com.example.myproject.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;
    private final JwtUtil jwtUtil;

    public AuthController(UserService userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        try {
            // 로그인 성공 시 User 객체를 반환하도록 UserService 수정
            User user = userService.login(request.getUserId(), request.getUserPw());
            String token = jwtUtil.generateToken(user.getUserId());
            Map<String, Object> response = new HashMap<>();
            response.put("token", token);
            response.put("userNo", user.getUserNo());
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }

}
