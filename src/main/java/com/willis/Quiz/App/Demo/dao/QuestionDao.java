package com.willis.Quiz.App.Demo.dao;

import com.willis.Quiz.App.Demo.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question,Integer> {
}
