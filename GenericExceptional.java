package com.kn.genricexcpetional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenericExceptional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the age:");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("He/She can vote.");
            } else {
                System.out.println("Sorry, not eligible to vote.");
            }

            System.out.println("Enter the numerator:");
            int numerator = scanner.nextInt();

            System.out.println("Enter the denominator:");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                throw new ArithmeticException("Denominator must not be zero.");
            }

            int result = numerator / denominator;
            System.out.println("Result of division: " + result);

            int[] arr = { 12, 54, 78 };
            System.out.println("Enter an index to retrieve from the array:");
            int index = scanner.nextInt();

            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Invalid index. Please provide a valid index.");
            }

            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (InputMismatchException e) {
            System.out.println("Age must be an integer.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("---End---");
        }
    }
}
