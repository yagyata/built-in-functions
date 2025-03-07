import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two date inputs from the user
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // Compare the dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

    }
}

//Input:
//Enter the first date (YYYY-MM-DD): 2025-04-25
//Enter the second date (YYYY-MM-DD): 2024-03-21

//Output:
//The first date is after the second date.
