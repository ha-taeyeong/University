package com.example.myproject.controller;

import com.example.myproject.dto.Contact;
import com.example.myproject.security.JwtUtil;
import com.example.myproject.service.ContactService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;
    private final JwtUtil jwtUtil; // JwtUtil 주입

    @PostMapping
    public ResponseEntity<?> saveContact(
            @RequestBody Contact contact,
            HttpServletRequest request // HTTP 요청 객체 주입
    ) {
        // 1. 헤더에서 JWT 토큰 추출
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return ResponseEntity.status(401).body("토큰이 유효하지 않습니다.");
        }

        String token = authHeader.substring(7);

        // 2. 토큰 유효성 검사
        if (!jwtUtil.validateToken(token)) {
            return ResponseEntity.status(403).body("토큰이 만료되었습니다.");
        }

        // 3. 토큰에서 userId 추출
        String userId = jwtUtil.extractUserId(token);

        // 4. Contact 객체에 userId 설정
        contact.setUserId(userId);

        // 5. 문의 저장
        contactService.saveContact(contact);

        return ResponseEntity.ok("문의가 정상적으로 저장되었습니다.");
    }
}

