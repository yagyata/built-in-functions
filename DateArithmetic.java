import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the date in format YYYY-MM-DD
        System.out.print("Enter a date (YYYY-MM-DD): ");
        LocalDate inputDate = LocalDate.parse(sc.nextLine());

        // Performing date arithmetic
        LocalDate modifiedDate = inputDate.plusDays(7)  // Add 7 days
                                         .plusMonths(1) // Add 1 month
                                         .plusYears(2)  // Add 2 years
                                         .minusWeeks(3); // Subtract 3 weeks

        // Display the result
        System.out.println("Modified Date: " + modifiedDate);

    }
}
