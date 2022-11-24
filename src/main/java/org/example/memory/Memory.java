package org.example.memory;

import org.example.calculation.Equations;
import org.example.calculation.Formula;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    public String newFormula;

    List<String> memory = new ArrayList<>(10);

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
}
