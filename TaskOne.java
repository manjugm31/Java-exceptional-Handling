package com.kn.task;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        performAddition(num1, num2);
        performSubtraction(num1, num2);
        try {
            performMultiplication(num1, num2);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        performDivision(num1, num2);
    }

    private static void performDivision(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed (b should not be zero).");
            } else {
                int result = a / b;
                System.out.println("Result of division: " + result);
            }
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void performMultiplication(int a, int b) throws Exception {
        if (a == 0 || b == 0) {
            throw new Exception("Multiplication by zero is not allowed (both numbers should be non-zero).");
        } else {
            int result = a * b;
            System.out.println("Result of multiplication: " + result);
        }
    }

    private static void performSubtraction(int a, int b) {
        try {
            int result = a - b;
            System.out.println("Result of subtraction: " + result);
        } catch (Exception e) {
            System.err.println("Error occurred during subtraction. Check the data types.");
        }
    }

    private static void performAddition(int a, int b) {
        int result = a + b;
        System.out.println("Result of addition: " + result);
    }
}
