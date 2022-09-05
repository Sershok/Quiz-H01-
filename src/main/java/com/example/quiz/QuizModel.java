package com.example.quiz;


import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@Getter
@Setter
public class QuizModel {
    private List<String> quizList = new ArrayList<>();

    private QuizView quizView;
    private List<String> answerQuizList = new ArrayList<>();
    private QuizResource quiz;

    public List<String> readQuizResource() {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(quiz.getQuizPathResource().getInputStream()))) {

            String value;

            while ((value = br.readLine()) != null) {
                String values = value;
                quizList.add(values);
            }
        } catch (IOException e) {
            System.err.println("Error!!!!!");
        }
        return quizList;

    }

    public List<String> readAnswerResource() {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(quiz.getAnswerPathResource().getInputStream()))) {
            String value;
            while ((value = br.readLine()) != null) {
                answerQuizList.add(value);
            }

        } catch (IOException e) {
            System.err.println("Error!!!!!");
        }

        return answerQuizList;
    }

}





