import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1: Convert Fahrenheit to Celsius");
        System.out.println("2: Convert Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        // Perform the conversion based on user choice
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

    }

    // Method to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
