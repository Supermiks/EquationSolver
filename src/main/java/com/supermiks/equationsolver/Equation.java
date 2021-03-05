package com.supermiks.equationsolver;

public class Equation {
    private String equation;

    public String getEquation() {
        return equation;
    }

    public Equation() {
        equation = EquationSolverLibrary.equationInput();
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }
}
