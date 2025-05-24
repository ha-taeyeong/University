package com.example.myproject.controller;

import com.example.myproject.dto.ListDto;
import com.example.myproject.service.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/list")
public class ListRestController {

    private final ListService listService;

    public ListRestController(ListService listService) { this.listService = listService; }

    @GetMapping
    public List<ListDto> getAllLists() { return listService.getAllList(); }
}
