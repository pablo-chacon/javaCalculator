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

import org.example.calculation.Equations;
import org.example.calculation.Formula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        //Global vars.
        boolean runProgram = true;
        List<String> memory = new ArrayList<>(10);

        //While true.
        while (runProgram) {

            //Vars within running program.
            Scanner input = new Scanner(System.in);
            //Menu
            System.out.print("""
                     >>>>>> *** <<<<<<
                     Simple calculator.
                     Operations: +, -, *, /
                     Check history: h
                     Exit program: q
                     Start: y/n
                     >>>""");
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
                        memory.add(newFormula + Equations.Addition(num1, num2));
                    }
                    case '-' -> {
                        // Subtraction
                        memory.add(newFormula +  Equations.Subtraction(num1, num2));
                    }
                    // Multiplication
                    case '*' -> {
                        memory.add(newFormula + Equations.Multiplication(num1, num2));
                    }
                    // Division
                    case '/' -> {
                        memory.add(newFormula + Equations.Division(num1, num2));
                    }
                    // Error handling
                    default -> {
                        System.out.println("Invalid input! Try again.");
                    }
                }
                System.out.println(memory);
            } else if (action.equals("h")) {
                /*Outputs the memory contents.*/
                for (int i = 0; i <= memory.size(); i++) {
                    System.out.println(memory.get(i));
                }

            } else if (action.equals("q")) {
                // if true: print exit message, Close Scanner, break while loop.
                input.close();
                System.out.println("Exiting. Bye.");
                runProgram = false;
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
    }
}





