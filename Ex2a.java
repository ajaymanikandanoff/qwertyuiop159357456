// Ex : 2a - Read 10 numbers, store them in an array, and display maximum and minimum values

import java.util.Scanner;

public class Ex2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Reading 10 numbers into the array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element [" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }

        // Initialize max and min with the first element
        int max = arr[0];
        int min = arr[0];

        // Traverse remaining elements to find max and min
        for (int i = 1; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Display results
        System.out.println("\n----- Array Analysis -----");
        System.out.println("Maximum value : " + max);
        System.out.println("Minimum value : " + min);

        sc.close();
    }
}
