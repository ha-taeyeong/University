package com.example.myproject.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String userId;
    private String userPw;
}
