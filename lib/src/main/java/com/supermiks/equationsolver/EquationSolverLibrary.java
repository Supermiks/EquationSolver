package com.supermiks.equationsolver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationSolverLibrary {

  private static final int COEFFICIENTS_COUNT = 3;
  private static final String REGEX_FOR_INPUT_VALIDATION = "^-?\\d+(?:\\.\\d+)*x\\^2[+-]\\d+(?:\\.\\d+)*x[+-]\\d+(?:\\.\\d+)*=0$";
  private static final String REGEX_TO_FIND_COEFFICIENTS = "-?\\d+(?:\\.\\d+)*";
  private static final String REGEX_TO_DELETE_DEGREE = "\\^2";
  private static final String REGEX_TO_DELETE_SPACES = "\\s+";
  private static final String REPLACE = "";

  public static boolean isInputValid(String input) {
    String changedInput = deleteSpaces(input);

    Pattern patternForInputValidation = Pattern
        .compile(REGEX_FOR_INPUT_VALIDATION, Pattern.CASE_INSENSITIVE);
    Matcher matcher = patternForInputValidation.matcher(changedInput);

    return matcher.matches();
  }

  public static double[] getCoefficients(Equation equation) {
    double[] coefficients = new double[COEFFICIENTS_COUNT];

    Pattern patternToDeleteDegree = Pattern.compile(REGEX_TO_DELETE_DEGREE);
    String expression = deleteSpaces(equation.getExpression());
    expression = patternToDeleteDegree.matcher(expression).replaceAll(REPLACE);

    Pattern patternToFindCoefficients = Pattern.compile(REGEX_TO_FIND_COEFFICIENTS);
    Matcher matcher = patternToFindCoefficients.matcher(expression);

    for (int i = 0; i < coefficients.length; i++) {
      matcher.find();
      coefficients[i] = Double.parseDouble(matcher.group());
    }

    return coefficients;
  }

  private static String deleteSpaces(String input) {
    //need to compile regex, because it's used several times

    Pattern patternToDeleteSpaces = Pattern.compile(REGEX_TO_DELETE_SPACES);
    return patternToDeleteSpaces.matcher(input).replaceAll(REPLACE);
  }
}
