package com.example.quiz;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Scanner;

@Setter
@Getter
public class QuizView {

    Scanner sc;
    String title;
    private Person person;

    private QuizModel quizModel;

    public void inputName() {
        sc = new Scanner(System.in);

        title = "\nHello\n" +
                "Glad to see you in our Quiz" +
                "\nInput your First Name:";
        System.out.println(title);

        person.setFirstName(Validator.validateSTR(sc));

        title = "Input your Last Name:";
        System.out.println(title);

        person.setLastName(Validator.validateSTR(sc));

        title = "\nGame On!!!\nGood luck!!!\n";

        System.out.println(title);

    }

    public void start(List<String> list, List<String> answerList) {
        inputName();
        int cntList = 1;
        int score = 0;

        for (int i = 0; i < list.size(); i++) {

            int finalCntList = cntList;
            list.stream()
                    .filter(str -> str.startsWith(String.valueOf(finalCntList)))
                    .forEach(System.out::println);

            if (answerList.contains(cntList + " - " + inputAnswer())) {
                score++;
                System.out.println("Its correct answer " + "\nYour score:" + score + "\n");
            } else
                System.out.println("Its wrong\n");

            cntList++;
        }
        showRes(score);
    }

    public int inputAnswer() {
        sc = new Scanner(System.in);
        title = "Choice answer 1-5";
        System.out.println(title);
        return Validator.validateNumber(sc);
    }

    public void showRes(int score) {
        String res = "Game over:\n" + person.getFirstName() + " " + person.getLastName()
                + "\nYour score:\n" + score;

        System.out.println(res);
    }
}
