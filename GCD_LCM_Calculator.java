import java.util.Scanner;

public class GCD_LCM_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}

//Input
//Enter the first number: 72
//Enter the second number: 96

//Output
//GCD of 72 and 96 is: 24
//LCM of 72 and 96 is: 288
