package org.example;

import java.util.Scanner;

    /*
        Simple calculator capable of handling simple operations (+, -, *, /).
        Using Scanner, enhanced switch to make calculations.
    */

public class Main {
    public static void main(String[] args) {

        //Vars, operator character, Scanner, double.
        char operator;
        Scanner input = new Scanner(System.in);
        double x, y, result;

        System.out.print("Input number:\n>");
        x = input.nextDouble();

        System.out.print("Operation:\n +, -, *, /\n>");
        operator = input.next().charAt(0);

        System.out.print("Input number:\n> ");
        y = input.nextDouble();

        // Compare operator var with cases.
        switch (operator) {
            // Addition
            case '+' -> {
                result = x + y;
                System.out.println(x + " + " + y + " = " + result);
            }
            // Subtraction
            case '-' -> {
                result = x - y;
                System.out.println(x + " - " + y + " = " + result);
            }
            // Multiplication
            case '*' -> {
                result = x * y;
                System.out.println(x + " * " + y + " = " + result);
            }
            // Division
            case '/' -> {
                result = x / y;
                System.out.println(x + " / " + y + " = " + result);
            }
            // Error handling
            default -> System.out.println("Invalid operator!");
        }
        // Close Scanner
        input.close();
    }
}