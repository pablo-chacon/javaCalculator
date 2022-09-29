package org.example;

/*
Author: ekarlsson66@gmail.com
Date: 2022-09-19
Version: 002
Simple calculator capable of handling simple operations (+, -, *, /).
Using Scanner, enhanced switch to make calculations.
If to make menu choice.
While loop to keep program running.
*/

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Global vars.
        boolean runProgram = true;

        HashMap<String, Double> memory = new HashMap<>();

        //While loop to keep program running.
        while (runProgram) {

            //Vars within running program.
            Scanner input = new Scanner(System.in);
            //Menu
            System.out.print("""
                    \n>>>>>> *** <<<<<<
                     Simple calculator.
                     Operations: +, -, *, /
                     Check history: h
                     Exit program: q 
                     Start: y/n
                    >>>>>>> """);
            /*
            If statement for decisions. The calculator calls method by operator
            evaluated in enhanced switch statement.
             */

            String action = input.next();

            if (action.equals("y")) {

                System.out.println("Input number:\n>");
                double num1 = Formula.getNum1(input.nextDouble());

                System.out.print("Operation:\n +, -, *, /\n>");
                String operation = Formula.getOperator(input.next());

                System.out.print("Input number:\n> ");
                double num2 = Equations.getNum2(input.nextDouble());
                String newFormula = num1 + " " + operation + " " + num2 + " ";
                // Call operation methods by input.
                double result;
                switch (operation.charAt(0)) {
                    case '+' -> {
                        // Calls Addition method with num1, num2 as parameters
                        result = Equations.Addition(num1, num2);
                        memory.put(newFormula, result);
                        System.out.println(memory);
                    }
                    case '-' -> {
                        // Subtraction
                        result = Equations.Subtraction(num1, num2);
                        memory.put(newFormula, result);
                        System.out.print(memory);
                    }
                    // Multiplication
                    case '*' -> {
                        result = Equations.Multiplication(num1, num2);
                        memory.put(newFormula, result);
                        System.out.print(memory);
                    }
                    // Division
                    case '/' -> {
                        result = Equations.Division(num1, num2);
                        memory.put(newFormula, result);
                        System.out.print(memory);
                    }
                    // Error handling
                    default -> {
                        System.out.println("Invalid input! Try again.");
                    }
                }
            } else if (action.equals("h")) {
                /*Outputs the memory contents. Coming features: Search by result, by newFormula,
                iterate through memory values and operand by next value.*/
                for (int i = 0; i <= memory.size(); i++) {
                    System.out.println(memory.values());
                }

            } else if (action.equals("q")) {
                // if true: print exit message, Close Scanner, break while loop.
                System.out.println("Exiting. Bye.");
                input.close();
                runProgram = false;
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
    }
}





