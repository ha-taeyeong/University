package com.example.myproject.dto;

import lombok.Data;

@Data
public class Contact {
    private Long id;
    private String userId;
    private String name;
    private String email;
    private String message;
}
