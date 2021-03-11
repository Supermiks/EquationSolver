package com.supermiks.equationsolver;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InputValidationTests {
    @Test
    public void isInputValid_NormalEquation_ShouldReturnTrue() {
        String input = "3x^2+3x+3=0";
        assertTrue(EquationSolverLibrary.isInputValid(input));
    }

    @Test
    public void isInputValid_InputWithSpaces_ShouldReturnTrue() {
        String input = "  2 x ^   2 + 3 x        + 4 = 0          ";
        assertTrue(EquationSolverLibrary.isInputValid(input));
    }
}
