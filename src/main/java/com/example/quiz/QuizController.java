package com.example.quiz;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QuizController {
    private QuizModel quizModel;
    private QuizView quizView;


    public void show() {
        quizView.start(quizModel.readQuizResource(),quizModel.readAnswerResource());
    }

}
