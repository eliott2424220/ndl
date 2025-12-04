package com.noid.backend; // même package que NoIdApplication

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Routers {
    private final BagOfQuestions bagOfQuestions = new BagOfQuestions();

    @GetMapping("/get/questions")
    public Question getQuestions(@RequestParam int id) {
        return bagOfQuestions.getQuestion(id);
    }
    @PostMapping("/post/questions")
    public void postQuestions(@RequestBody Question questions) {
        bagOfQuestions.addQuestion(questions);
    }
    @DeleteMapping("/delete/questions")
    public int deleteQuestions(@RequestParam int id) {
        return bagOfQuestions.removeQuestion(id);
    }

}
