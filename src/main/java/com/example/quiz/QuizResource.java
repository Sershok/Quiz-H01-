package com.example.quiz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.ClassPathResource;

@Setter
@Getter
public class QuizResource {

    private ClassPathResource quizPathResource;

    private ClassPathResource answerPathResource;

}
