package com.example;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;
    private final FileStorageService fileStorageService; // 다운로드를 위해 필요

    public PostController(PostService postService, FileStorageService fileStorageService) {
        this.postService = postService;
        this.fileStorageService = fileStorageService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "posts/list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/form";
    }

    // 파일 받기 위해 MultipartFile 추가
    @PostMapping
    public String create(@ModelAttribute Post post, @RequestParam("file") MultipartFile file) throws IOException {
        postService.save(post, file);
        return "redirect:/posts";
    }
    
    // 상세 보기
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.findById(id));
        return "posts/detail";
    }

    // 수정 폼
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.findById(id));
        return "posts/form";
    }
    
    // 수정 처리 (파일 수정은 복잡해지므로, 이번 예시에서는 기존 파일 유지 로직만 적용)
    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Post formPost, @RequestParam("file") MultipartFile file) throws IOException {
        Post post = postService.findById(id);
        post.setTitle(formPost.getTitle());
        post.setContent(formPost.getContent());
        post.setWriter(formPost.getWriter());
        
        // 새 파일이 올라오면 교체, 아니면 유지
        if (file != null && !file.isEmpty()) {
             postService.save(post, file); // 새 파일 저장
        } else {
             postService.save(post, null); // 내용만 수정
        }
        return "redirect:/posts/" + id;
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        postService.deleteById(id);
        return "redirect:/posts";
    }

    // === 다운로드 기능 추가 ===
    @GetMapping("/{id}/download")
    public ResponseEntity<Resource> download(@PathVariable Long id) throws IOException {
        Post post = postService.findById(id);
        
        // 파일이 없는 게시글이면 에러 처리 혹은 빈 응답
        if(post.getStoredFilename() == null) return ResponseEntity.notFound().build();

        Resource resource = fileStorageService.loadFileAsResource(post.getStoredFilename());
        
        String encodedName = UriUtils.encode(post.getOriginalFilename(), StandardCharsets.UTF_8);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + encodedName + "\"")
                .body(resource);
    }
}
