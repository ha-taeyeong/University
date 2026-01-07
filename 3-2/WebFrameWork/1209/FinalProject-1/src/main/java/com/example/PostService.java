package com.example;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final FileStorageService fileStorageService; // 파일 저장 도구 추가

    // 생성자 주입
    public PostService(PostRepository postRepository, FileStorageService fileStorageService) {
        this.postRepository = postRepository;
        this.fileStorageService = fileStorageService;
    }

    public List<Post> findAll() { return postRepository.findAll(); }

    public Post findById(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("글 없음"));
    }

    // 파일 업로드 처리 추가
    public void save(Post post, MultipartFile file) throws IOException {
        // 파일이 들어왔는지 확인
        if (file != null && !file.isEmpty()) {
            // 디스크에 저장하고 저장된 파일명(UUID) 받기
            String storedFilename = fileStorageService.storeFile(file);
            
            // DB에 저장할 정보 세팅
            post.setOriginalFilename(file.getOriginalFilename());
            post.setStoredFilename(storedFilename);
            post.setFileSize(file.getSize());
        }
        postRepository.save(post);
    }

    public void deleteById(Long id) { postRepository.deleteById(id); }
}
