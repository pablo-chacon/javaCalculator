package org.example;

public class Equations extends Formula {

    public double num1, num2;
    public char operator;
    public Equations(Double num1, char operator, Double num2) {
        super(num1, operator, num2);
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public static double Addition(double num1, double num2) {
        double sum = getNum1(num1) + getNum2(num2);
        return sum;
    }

    public static double Subtraction(double num1, double num2) {
        double sum = getNum1(num1) - getNum2(num2);
        return sum;
    }

    public static double Multiplication(double num1, double num2) {
        double sum = getNum1(num1) * getNum2(num2);
        return sum;
    }

    public static double Division(double num1, double num2) {
        double sum = getNum1(num1) / getNum2(num2);
        return sum;
    }
}
