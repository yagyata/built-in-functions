import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of terms
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Generate and print Fibonacci sequence
        generateFibonacci(terms);

    }

    // Method to generate and print the Fibonacci sequence
    private static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Compute the next term
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next line after printing the sequence
    }
}
