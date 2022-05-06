package com.company.Calculator;

import static com.company.Calculator.Calculator.Operation.*;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    private int doubleForInt(double result) {
        return (int) result;
    }

    @Override
    public int sum(int arg0, int arg1) {
        return doubleForInt(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(SUM)
                .result());
    }

    @Override
    public int mult(int arg0, int arg1) {
        return doubleForInt(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(MULT)
                .result());
    }

    @Override
    public int pow(int a, int b) {
        return doubleForInt(target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(POW)
                .result());
    }
}