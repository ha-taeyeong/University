package com.example.myproject.controller;

import com.example.myproject.dto.ListDto;
import com.example.myproject.security.JwtUtil;
import com.example.myproject.service.ListService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/list")
public class ListRestController {

    private final ListService listService;
    private final JwtUtil jwtUtil;

    @Autowired
    public ListRestController(ListService listService, JwtUtil jwtUtil) {
        this.listService = listService;
        this.jwtUtil = jwtUtil;
    }

    @GetMapping
    public ResponseEntity<List<ListDto>> getMyLists(
            @RequestHeader("Authorization") String authHeader,
            @RequestParam("date") String dateStr // yyyy-MM-dd 형식
    ) {
        String token = authHeader.replace("Bearer ", "");
        Long userNo = jwtUtil.extractUserNo(token);
        LocalDate listDate;
        try {
            listDate = LocalDate.parse(dateStr); // 날짜 포맷 변환
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
        List<ListDto> myLists = listService.getListByUserNo(userNo, listDate);
        return ResponseEntity.ok(myLists);
    }

    @PostMapping
    public ResponseEntity<String> createList(
            @RequestBody ListDto list,
            @RequestHeader("Authorization") String authHeader,
            HttpServletRequest request) {
        String token = authHeader.replace("Bearer ", "");
        Long userNo = jwtUtil.extractUserNo(token);
        list.setUserNo(userNo);
        System.out.println("list.getUserNo(): " + list.getUserNo());

        String completedYn = "N";
        String regId = String.valueOf(userNo); // 실제 사용자 번호로 등록자 지정
        String regIp = request.getRemoteAddr();
        String delYn = "N"; // 기본값
        int result = listService.createList(list, completedYn, regId, regIp, delYn);
        return result > 0
                ? ResponseEntity.ok("List created successfully")
                : ResponseEntity.status(400).body("Error creating list");
    }

    @PutMapping("/{listNo}")
    public ResponseEntity<String> updateList(
            @PathVariable int listNo,
            @RequestBody ListDto list,
            @RequestHeader("Authorization") String authHeader,
            HttpServletRequest request) {
        String token = authHeader.replace("Bearer ", "");
        Long userNo = jwtUtil.extractUserNo(token);
        list.setListNo(listNo);
        String modId = String.valueOf(userNo); // 실제 사용자 번호로 수정자 지정
        String modIp = request.getRemoteAddr();
        int result = listService.updateList(list, modId, modIp);
        return result > 0 ?
                ResponseEntity.ok("List updated successfully")
                : ResponseEntity.status(400).body("Error updating list");
    }

    @DeleteMapping("/{listNo}")
    public ResponseEntity<String> deleteList(
            @PathVariable int listNo,
            @RequestHeader("Authorization") String authHeader,
            HttpServletRequest request) {
        String token = authHeader.replace("Bearer ", "");
        Long userNo = jwtUtil.extractUserNo(token);

        ListDto list = new ListDto();
        list.setListNo(listNo);
        String modId = String.valueOf(userNo); // 실제 사용자 번호로 수정자 지정
        String modIp = request.getRemoteAddr();
        String delYn = "Y"; // 기본값
        int result = listService.deleteList(list, modId, modIp, delYn);
        return result > 0 ?
                ResponseEntity.ok("List updated successfully")
                : ResponseEntity.status(400).body("Error deleting list");
    }

    @DeleteMapping("/permanent/{listNo}")
    public ResponseEntity<String> deleteListPermanently(@PathVariable int listNo) {
        int result = listService.deleteListPermanently(listNo);
        return result > 0 ?
                ResponseEntity.ok("List updated successfully")
                : ResponseEntity.status(400).body("Error permanent deleting list");
    }

    @GetMapping("/{listNo}")
    public ResponseEntity<ListDto> getListInfo(@PathVariable int listNo) {
        ListDto list = listService.findByListNo(listNo);
        return ResponseEntity.ok(list);
    }

}