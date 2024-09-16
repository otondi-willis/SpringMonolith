package com.willis.Quiz.App.Demo.service;

import com.willis.Quiz.App.Demo.dao.QuestionDao;
import com.willis.Quiz.App.Demo.dao.QuizDao;
import com.willis.Quiz.App.Demo.model.Question;
import com.willis.Quiz.App.Demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category);

        // Ensure we only return up to numQ questions
        if (questions.size() < numQ) {
            return new ResponseEntity<>("Not enough questions in the selected category", HttpStatus.BAD_REQUEST);
        }
        // Limiting the questions to numQ
        List<Question> limitedQuestions = questions.subList(0, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(limitedQuestions);
        quizDao.save(quiz);




        return new ResponseEntity<>("Quiz created successfully", HttpStatus.CREATED);

    }
}
