package com.example.myproject.controller;

import com.example.myproject.dto.ListDto;
import com.example.myproject.dto.User;
import com.example.myproject.service.ListService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/list")
public class ListRestController {

    private final ListService listService;

    public ListRestController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping
    public List<ListDto> getAllLists() { return listService.getAllList(); }

    @PostMapping
    public ResponseEntity<String> createList(@RequestBody ListDto list, HttpServletRequest request) {
        String completedYn = "N";
        String regId = "system"; // 임시 등록자
        String regIp = request.getRemoteAddr();
        String delYn = "N"; // 기본값
        int result = listService.createList(list, completedYn, regId, regIp, delYn);
        return result > 0
                ? ResponseEntity.ok("User created successfully")
                : ResponseEntity.status(400).body("Error creating list");
    }

    @PutMapping("/{listNo}")
    public ResponseEntity<String> updateList(@PathVariable int listNo, @RequestBody ListDto list, HttpServletRequest request) {
        list.setListNo(listNo);
        String modId = "system";
        String modIp = request.getRemoteAddr();
        int result = listService.updateList(list, modId, modIp);
        return result > 0 ?
                ResponseEntity.ok("User updated successfully")
                : ResponseEntity.status(400).body("Error updating list");
    }

    @DeleteMapping("/{listNo}")
    public ResponseEntity<String> deleteList(@PathVariable int listNo, HttpServletRequest request) {
        ListDto list = new ListDto();
        list.setListNo(listNo);
        String modId = "system";
        String modIp = request.getRemoteAddr();
        String delYn = "Y"; // 기본값
        int result = listService.deleteList(list, modId, modIp, delYn);
        return result > 0 ?
                ResponseEntity.ok("User updated successfully")
                : ResponseEntity.status(400).body("Error deleting list");
    }

    @DeleteMapping("/permanent/{listNo}")
    public ResponseEntity<String> deleteListPermanently(@PathVariable int listNo) {
        int result = listService.deleteListPermanently(listNo);
        return result > 0 ?
                ResponseEntity.ok("User updated successfully")
                : ResponseEntity.status(400).body("Error permanent deleting list");
    }

    @GetMapping("/{listNo}")
    public ResponseEntity<ListDto> getListInfo(@PathVariable int listNo) {
        ListDto list = listService.findByListNo(listNo);
        return ResponseEntity.ok(list);
    }

}
