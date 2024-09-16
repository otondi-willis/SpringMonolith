package com.willis.Quiz.App.Demo.dao;

import com.willis.Quiz.App.Demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
}
