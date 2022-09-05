package com.example.quiz;

import java.util.Scanner;

public class Validator {

    public static String validateSTR(Scanner sc) {
        String str = sc.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print(Constants.EMPTY_NAME_MSG);
            str = sc.nextLine().trim();
        }
        return str;
    }

}