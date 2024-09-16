package com.willis.Quiz.App.Demo.service;

import com.willis.Quiz.App.Demo.dao.QuestionDao;
import com.willis.Quiz.App.Demo.dao.QuizDao;
import com.willis.Quiz.App.Demo.model.Question;
import com.willis.Quiz.App.Demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category,numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions();
    }
}
