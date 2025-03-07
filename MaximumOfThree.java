import java.util.Scanner;

public class MaximumOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();

		int max = findMaximum(num1, num2, num3);
		System.out.println("The maximum number is: " + max);
	}

	public static int findMaximum(int a, int b, int c) {
		return Math.max(a, Math.max(b,c));
	}
}
