package com.willis.Quiz.App.Demo.service;

import com.willis.Quiz.App.Demo.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
}
