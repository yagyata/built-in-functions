import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = scanner.nextInt();

        // Take user input for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform operation based on user choice
        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                validChoice = false;
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

        scanner.close();
    }

    // Method for addition
    private static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    private static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    private static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    private static double divide(double a, double b) {
        return a / b;
    }
}
