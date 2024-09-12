package com.willis.Quiz.App.Demo.controller;

import com.willis.Quiz.App.Demo.Question;
import com.willis.Quiz.App.Demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}