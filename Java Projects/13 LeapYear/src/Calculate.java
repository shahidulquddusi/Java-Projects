import java.time.LocalDate;

public class Calculate {

    static LocalDate date = Input.getDate();

    /**
     * A simple method that validates {@code date} as input
     * to determine {@code leap year} and returns {@code boolean} values.
     * <br><br>The method uses {@code Scanner} to receive input.
     * It uses build-in {@code isLeapYear()} method for validation
     * of {@code leap year}.
     * <br>
     * @return <span style="color: #6198d4;">{@code boolean}</span>
     */
    static void isLeapYearMethod() {

        boolean isLeapYear = date.isLeapYear();
        System.out.printf("a. Is leap year - %s\n", isLeapYear);
        }

    /**
     * A simple method that validates that {@code date} is in {@code leap year}
     * or not and returns {@code boolean} values.
     * <br><br>The method uses {@code Scanner} to receive input
     * and {@code DateTimeFormatter} for validation of {@code date}.
     * <br>
     * @return <span style="color: #6198d4;">{@code boolean}</span>
     */
    static void isLeapYearCalculated() {

        int year = date.getYear();
        System.out.printf("b. Is leap year - %s\n",
                year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));

    }
}
