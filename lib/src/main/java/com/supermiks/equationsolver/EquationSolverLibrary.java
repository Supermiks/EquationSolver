package com.supermiks.equationsolver;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationSolverLibrary {
    public static Equation equationInput () {
        String input;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                input = scanner.nextLine();
                return new Equation(input);
            }
            catch (IllegalArgumentException ex) {
                System.out.println("Wrong format, try again");
            }
        }
    }
    public static boolean isInputValid(String input) {
        String regex = "^-?\\d+x\\^2[+-]\\d+x[+-]\\d+=0$";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(deleteAllSpaces(input));

        return matcher.matches();
    }

    public static String deleteAllSpaces(String input) {
        String regex = "\\s+";
        String replace = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.replaceAll(replace);
    }
}
