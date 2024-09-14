package com.willis.Quiz.App.Demo.controller;

import com.willis.Quiz.App.Demo.Question;
import com.willis.Quiz.App.Demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addQuestions(@RequestBody Question question){
        return questionService.addQuestions(question);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteQuestions(@PathVariable Integer id){
        return questionService.deleteQuestions(id);
    }
    @PutMapping("/update")
    public String updateQuestions(@RequestBody Question question){
        return questionService.updateQuestions(question);
    }
}
