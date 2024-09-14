package com.willis.Quiz.App.Demo.service;

import com.willis.Quiz.App.Demo.Question;
import com.willis.Quiz.App.Demo.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<List<Question>> getQuestionByCategory(String category) {
        try{
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> addQuestions(Question question) {
        questionDao.save(question);

       try {
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } catch (Exception e){
           e.printStackTrace();
       }
        return new ResponseEntity<>("Failed to add", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteQuestions(Integer id) {
        questionDao.deleteById(id);
        return new ResponseEntity<>("success",HttpStatus.OK);
    }

    public String updateQuestions(Question question) {
        questionDao.save(question);
        return "updated successfully";
    }
}
