package com.smarbl_classes;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Select an operation (1/2/3/4): ");

        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
System.out.println("Test ");

        scanner.close();
    }

}
