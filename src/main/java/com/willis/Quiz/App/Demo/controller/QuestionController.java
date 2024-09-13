package com.willis.Quiz.App.Demo.controller;

import com.willis.Quiz.App.Demo.Question;
import com.willis.Quiz.App.Demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("/category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("/add")
    public String addQuestions(@RequestBody Question question){
        return questionService.addQuestions(question);
    }
}
