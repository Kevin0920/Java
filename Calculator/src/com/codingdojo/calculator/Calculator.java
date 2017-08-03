package com.codingdojo.calculator;

public class Calculator {
    private double operandOne;
    private double operandTwo;

    private double result;
    private String operation;


    // getter
    public double getOperandOne() {
        return operandOne;
    }
    // setter
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }
    //getter
    public double getOperandTwo() {
        return operandTwo;
    }
    //setter
    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void performOperation() {
        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        }
        else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        }
        else {
            System.out.println("no operation");
            result = 0;
        }

    }

    public double getResult() {
        return result;
    }




}
