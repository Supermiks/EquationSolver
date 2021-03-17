package com.supermiks.equationsolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equation {

  private String expression;

  public Equation() {
    inputExpression();
  }

  public Equation(String expression) {
    setExpression(expression);
  }

  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    if (!EquationSolverLibrary.isInputValid(expression)) {
      throw new IllegalArgumentException("Invalid Input");
    } else {
      this.expression = expression;
    }
  }

  public void inputExpression() {
    String input;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter equation like ax^2 + bx + c = 0");

    while (scanner.hasNext()) {
      try {
        input = scanner.nextLine();
        setExpression(input);
        break;
      } catch (IllegalArgumentException ex) {
        System.out.println("Wrong format, try again");
      }
    }
  }

  public void solveEquation() {
    List<Double> solutions = new ArrayList<Double>();
    solutions = EquationSolverLibrary.getSolutions
        (EquationSolverLibrary.getCoefficients(this));

    System.out.println("Solutions of the " + toString() + ":");

    if (solutions.isEmpty()) {
      System.out.println("Negative discriminant!");
    } else {
      for (double solution : solutions) {
        System.out.println(solution);
      }
    }
  }

  @Override
  public String toString() {
    return "Equation {" + expression + '}';
  }
}
