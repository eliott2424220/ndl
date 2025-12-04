package com.noid.backend; // même package que NoIdApplication

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routers {
    @GetMapping("/get/questions")
    public String getQuestions() {
        return "Hello Spring Boot!";
    }
    @PostMapping("/post/questions")
    public String postQuestions() {
        return "Hello Spring Boot!";
    }
    @DeleteMapping("/delete/questions")
    public String deleteQuestions() {
        return "Hello Spring Boot!";
    }
}
