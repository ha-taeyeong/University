package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.UUID;

@Service
public class FileStorageService {
    private final Path uploadDir;

    public FileStorageService(@Value("${file.upload-dir}") String uploadDir) throws IOException {
        this.uploadDir = Paths.get(uploadDir).toAbsolutePath().normalize();
        Files.createDirectories(this.uploadDir);
    }

    public String storeFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) return null;
        String originalFilename = StringUtils.cleanPath(file.getOriginalFilename());
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
        String storedFilename = UUID.randomUUID().toString() + ext;
        
        Files.copy(file.getInputStream(), this.uploadDir.resolve(storedFilename), StandardCopyOption.REPLACE_EXISTING);
        return storedFilename;
    }

    public Resource loadFileAsResource(String storedFilename) throws MalformedURLException {
        Path filePath = this.uploadDir.resolve(storedFilename).normalize();
        Resource resource = new UrlResource(filePath.toUri());
        if(resource.exists()) return resource;
        else throw new RuntimeException("File not found " + storedFilename);
    }
}
