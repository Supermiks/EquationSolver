package com.supermiks.equationsolver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class SolveEquationTests {
  @Test
  public void getSolutions_CoefficientsForSolvableEquationWithTwoSolutions_ShouldReturnEquals() {
    double[] coefficients = new double[] {4, 5, -6};
    List<Double> expectedSolutions = new ArrayList<>(Arrays.asList(0.75, -2.0));

    List<Double> actualSolutions = EquationSolverLibrary.getSolutions(coefficients);

    assertEquals(expectedSolutions, actualSolutions);
  }

  @Test
  public void getSolutions_CoefficientsForSolvableEquationWithOneSolution_ShouldReturnEquals() {
    double[] coefficients = new double[] {1, 6, 9};
    List<Double> expectedSolutions = Collections.singletonList(-3.0);

    List<Double> actualSolutions = EquationSolverLibrary.getSolutions(coefficients);

    assertEquals(expectedSolutions, actualSolutions);
  }

  @Test
  public void getSolutions_CoefficientsForEquationWithNegativeDiscriminant_ShouldReturnTrue() {
    double[] coefficients = new double[] {2, 4, 7};

    List<Double> actualSolutions = EquationSolverLibrary.getSolutions(coefficients);

    assertTrue(actualSolutions.isEmpty());
  }
}
