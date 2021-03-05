package com.supermiks.equationsolver;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationSolverLibrary {
    public static String equationInput () {
        String input;
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter an equation like ax^2 + bx + c = 0");
            input = scanner.nextLine();

            if(isInputValid(input)) return input;
            else System.out.println("Wrong format, try again");
        }
    }
    public static boolean isInputValid(String input) {
        long before = System.currentTimeMillis();

        String regex = "^-?\\d+x\\^2[+-]\\d+x[+-]\\d+=0$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        long after = System.currentTimeMillis();
        System.out.println(after-before + " ms");
        return matcher.matches();
    }
}
