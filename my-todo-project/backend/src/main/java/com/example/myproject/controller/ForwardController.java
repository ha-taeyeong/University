package com.example.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardController {
    // /api, /assets, /js, /css, /images, /favicon.ico, /index.html로 시작하지 않는 경로만 처리
    @GetMapping(value = {"/{path:^(?!api|assets|js|css|images|favicon\\.ico|index\\.html$).*$}"})
    public String forward() {
        return "forward:/index.html";
    }
}
