package org.example;

public class Formula {

    double num1, num2;
    char operator;

    public Formula(double num1, char operator, double num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public static double getNum1(Double num1) {
        return num1;
    }

    public void setNum1() {
        this.num1 = num1;
    }

    public static double getNum2(double num2) {
        return num2;
    }

    public void setNum2() {
        this.num2 = num2;
    }

    public static String getOperator(String operator) {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
