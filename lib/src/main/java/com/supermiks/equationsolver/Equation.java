package com.supermiks.equationsolver;

public class Equation {
    private String equation;

    public Equation(String equation) {
       setEquation(equation);
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        if (EquationSolverLibrary.isInputValid(equation)) {
            this.equation = equation;
        }

        else throw new IllegalArgumentException("Invalid Input");
    }

    @Override
    public String toString() {
        return "Equation{" +
                "equation='" + equation + '\'' +
                '}';
    }
}
