package org.example;

public class Equations {

    public double num1, num2;

    public Equations() {
        this.num1 = getNum1(num1);
        this.num2 = getNum2(num2);
    }

    public double getNum1(Double num1) {
        return num1;
    }

    public void setNum1() {
        this.num1 = num1;
    }

    public double getNum2(Double num2) {
        return num2;
    }

    public void setNum2() {
        this.num2 = getNum2(num2);
    }


    public double Addition(double num1, double num2) {
        double sum = getNum1(num1) + getNum2(num2);
        return sum;
    }

    public double Subtraction(double num1, double num2) {
        double sum = getNum1(num1) - getNum2(num2);
        return sum;
    }

    public double Multiplication(double num1, double num2) {
        double sum = getNum1(num1) * getNum2(num2);
        return sum;
    }

    public double Division(double num1, double num2) {
        double sum = getNum1(num1) / getNum2(num2);
        return sum;
    }
}
