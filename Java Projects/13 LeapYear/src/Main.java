import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date (e.g., YYYY-MM-DD): ");
        String dateString = input.nextLine();
        LocalDate date = LocalDate.parse(dateString);
//        System.out.println(date);

        boolean isLeapYear = date.isLeapYear();
        System.out.printf("a. Is leap year - %s\n", isLeapYear);

        // Leap Year conditions:
        // - divisible by 4
        // - not divisible by 100
        // - divisible by 400

        int year = date.getYear();
        System.out.printf("b. Is leap year - %s\n",
                year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
/*
        Output Samples:
        Enter date (e.g., YYYY-MM-DD): 2100-07-19
            a. Is leap year - false
            b. Is leap year - false
        Enter date (e.g., YYYY-MM-DD): 2000-09-30
            a. Is leap year - true
            b. Is leap year - true
        Enter date (e.g., YYYY-MM-DD): 2024-12-12
            a. Is leap year - true
            b. Is leap year - true
*/
    }
}