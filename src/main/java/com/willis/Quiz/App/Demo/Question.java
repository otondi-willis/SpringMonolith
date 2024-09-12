package com.willis.Quiz.App.Demo;

import jakarta.persistence.Id;

public class Question {
    @Id
    private Integer id;
    private String difficultyLevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String rightAnswer;

}
