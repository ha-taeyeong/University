package com.example.myproject.service;

import com.example.myproject.dao.ListDao;
import com.example.myproject.dto.ListDto;
import com.example.myproject.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {

    private final ListDao listDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public ListService(ListDao listDao, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.listDao = listDao;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public List<ListDto> getAllList() { return this.listDao.getAllList(); }
}
