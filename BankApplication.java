package com.kn.exceptiontwo;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bank application will start.");
        System.out.println("Enter the PIN:");

        try {
            int pin = scanner.nextInt();

            if (pin == 9999) {
                System.out.println("Withdrawal of amount is allowed.");
            } else {
                System.out.println("Incorrect PIN. Please re-enter.");
            }
        } catch (Exception e) {
            System.out.println("Exception handled successfully. Please enter a valid PIN.");
        } finally {
            System.out.println("Bank application has stopped.");
        }
    }
}
