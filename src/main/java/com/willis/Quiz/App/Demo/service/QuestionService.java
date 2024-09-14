package com.willis.Quiz.App.Demo.service;

import com.willis.Quiz.App.Demo.Question;
import com.willis.Quiz.App.Demo.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions() {
        return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);

    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestions(Question question) {
        questionDao.save(question);

        return "success";
    }

    public String deleteQuestions(Integer id) {
        questionDao.deleteById(id);
        return "success";
    }

    public String updateQuestions(Question question) {
        questionDao.save(question);
        return "updated successfully";
    }
}
