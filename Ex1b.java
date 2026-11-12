// Ex : 1b - Demonstrate simple print, class and object creation in java (Arithmetic operations)

import java.util.Scanner;

public class Ex1b {
    public static void main(String[] args) {
        // Create Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);

        // Read two integer numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = (num2 != 0) ? (num1 / num2) : 0;
        int remainder = (num2 != 0) ? (num1 % num2) : 0;

        // Display results
        System.out.println("\n----- Arithmetic Operations Results -----");
        System.out.println("Addition (num1 + num2)       : " + sum);
        System.out.println("Subtraction (num1 - num2)    : " + difference);
        System.out.println("Multiplication (num1 * num2) : " + product);
        if (num2 != 0) {
            System.out.println("Division (num1 / num2)       : " + quotient);
            System.out.println("Modulus (num1 % num2)        : " + remainder);
        } else {
            System.out.println("Division & Modulus cannot be computed (division by zero).");
        }

        // Close scanner
        sc.close();
    }
}
