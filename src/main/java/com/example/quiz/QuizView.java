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
    int cntList = 1;
    int score = 0;
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

        for (int i = 0; i < list.size(); i++) {

            list
                    .stream()
                    .filter(str -> str.startsWith(String.valueOf(cntList)))
                    .forEach(System.out::println);

            if (answerList.contains(cntList + " - " + inputAnswer())) {
                score++;
                System.out.println("Its correct answer " + "\nYour score:" + score + "\n");
            } else
                System.out.println("Its wrong\n");

            cntList++;
        }
        showRes();
    }

    public String inputAnswer() {
        sc = new Scanner(System.in);
        title = "Choice answer 1-5";
        System.out.println(title);
        return Validator.validateSTR(sc);
    }

    public void showRes() {
        String res = "Game over:\n" + person.getFirstName() + " " + person.getLastName()
                + "\nYour score:\n" + score;

        System.out.println(res);
    }
}
