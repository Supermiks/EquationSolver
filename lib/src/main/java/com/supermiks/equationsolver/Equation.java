package com.supermiks.equationsolver;

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

    while (true) {
      try {
        input = scanner.nextLine();
        setExpression(input);
        break;
      } catch (IllegalArgumentException ex) {
        System.out.println("Wrong format, try again");
      }
    }
  }

  @Override
  public String toString() {
    return "Equation{" + expression + '\'' + '}';
  }
}
