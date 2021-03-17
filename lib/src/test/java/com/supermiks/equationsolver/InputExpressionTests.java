package com.supermiks.equationsolver;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class InputExpressionTests {

  @Test
  public void isInputValid_NormalExpression_ShouldReturnTrue() {
    String input = "3x^2+3x+3=0";
    assertTrue(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_ExpressionWithDecimalCoefficients_ShouldReturnTrue() {
    String input = "3000.03x^2 + 3.452x - 17.325 = 0";
    assertTrue(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_ExpressionWithNegativeCoefficients_ShouldReturnTrue() {
    String input = "-332x^2-0.3x-1234=0";
    assertTrue(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_InputInUpperCase_ShouldReturnTrue() {
    String input = "2x^2 + 3X + 4 = 0";
    assertTrue(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_InputWithoutSpaces_ShouldReturnTrue() {
    String input = "3x^2+14x+44=0";
    assertTrue(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_InputWithSpaces_ShouldReturnTrue() {
    String input = "  2 x ^   2 + 3 x        + 4 = 0          ";
    assertTrue(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_WrongFormatOfExpression1_ShouldReturnFalse() {
    String input = "ahj33x^2kh+vrklhfoii";
    assertFalse(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_WrongFormatOfExpression2_ShouldReturnFalse() {
    String input = "2x^2 + 4 = 0";
    assertFalse(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_WrongFormatOfExpression3_ShouldReturnFalse() {
    String input = "2x^2//+  3x+ 4=0";
    assertFalse(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_WrongFormatOfExpression4_ShouldReturnFalse() {
    String input = "2x^2 + 3x + 4";
    assertFalse(EquationSolverLibrary.isInputValid(input));
  }

  @Test
  public void isInputValid_WrongFormatOfExpression5_ShouldReturnFalse() {
    String input = "3x^3 + 3x + 4 = 0";
    assertFalse(EquationSolverLibrary.isInputValid(input));
  }
}
