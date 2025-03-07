import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate factorial using recursion
        long factorial = calculateFactorial(number);

        // Display result
        System.out.println("Factorial of " + number + " is: " + factorial);

    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }
}

//Input:
//Enter a number: 5

//Output:
//Factorial of 5 is: 120
