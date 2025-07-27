import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Input {

    static Scanner input= new Scanner(System.in);
    static String dateString;
    static String dateFormatPattern = "yyyy-MM-dd";
    static LocalDate date;

    /**
     * A simple method that validates {@code date} as input
     * and returns {@code boolean} values.
     * <br><br>The method uses {@code Scanner} to receive input
     * and {@code DateTimeFormatter} for validation of {@code date}.
     * <br>
     * @return <span style="color: #6198d4;">{@code boolean}</span>
     */
    static boolean isValidDateFormat() {

        dateString = input.nextLine();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatPattern);
            LocalDate.parse(dateString, formatter); // Attempt to parse the string
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * A simple method that validates and then accepts {@code date} as input with recursive request.
     * <br><br>The method uses {@code Scanner} to receive input.
     * <br>
     * @return <span style="color: #6198d4;">{@code LocalDate}</span>
     */
    static LocalDate getDate() {
        System.out.print("Enter date (e.g., YYYY-MM-DD): ");

        while (true) {
            if (isValidDateFormat()) {
                date = LocalDate.parse(dateString);
                return date;
            } else {
                System.out.print("Invalid input! Re-enter date (e.g., YYYY-MM-DD): ");
//                input.nextLine(); // stops infinite loop - Consumes invalid input
//                - not necessary here
            }
        }
    }

}
