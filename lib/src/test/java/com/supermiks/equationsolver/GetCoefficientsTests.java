package com.supermiks.equationsolver;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GetCoefficientsTests {

  @Test
  public void getCoefficients_NormalEquation_ShouldReturnEquals() {
    Equation equation = new Equation("2x^2 + 4x + 3 = 0");
    double[] expectedCoefficients = {2, 4, 3};

    double[] actualCoefficients = EquationSolverLibrary.getCoefficients(equation);

    assertArrayEquals(expectedCoefficients, actualCoefficients, 0);
  }

  @Test
  public void getCoefficients_EquationWithDecimalCoefficients_ShouldReturnEquals() {
    Equation equation = new Equation("0.0030021300x^2 + 2010.013x + 121.1344 = 0");
    double[] expectedCoefficients = {0.0030021300, 2010.013, 121.1344};

    double[] actualCoefficients = EquationSolverLibrary.getCoefficients(equation);

    assertArrayEquals(expectedCoefficients, actualCoefficients, 0);
  }

  @Test
  public void getCoefficients_EquationWithNegativeCoefficients_ShouldReturnEquals() {
    Equation equation = new Equation("-332x^2-0.0037x-1234=0");
    double[] expectedCoefficients = {-332, -0.0037, -1234};

    double[] actualCoefficients = EquationSolverLibrary.getCoefficients(equation);

    assertArrayEquals(expectedCoefficients, actualCoefficients, 0);
  }

  @Test
  public void getCoefficients_EquationWithExpressionInUpperCase_ShouldReturnEquals() {
    Equation equation = new Equation("2X^2 + 4X - 3.03 = 0");
    double[] expectedCoefficients = {2, 4, -3.03};

    double[] actualCoefficients = EquationSolverLibrary.getCoefficients(equation);

    assertArrayEquals(expectedCoefficients, actualCoefficients, 0);
  }
}
