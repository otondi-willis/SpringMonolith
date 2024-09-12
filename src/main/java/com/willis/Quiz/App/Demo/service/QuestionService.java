package com.willis.Quiz.App.Demo.service;

import com.willis.Quiz.App.Demo.Question;
import com.willis.Quiz.App.Demo.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();

    }
}
