package com.willis.Quiz.App.Demo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String category;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questiontitle;
    private String rightanswer;

}
