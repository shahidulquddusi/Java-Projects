import java.util.Scanner;

public class Calculate {

    /**
     * A simple method that calculates {@code multiplication table}
     * up to the given limit.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} and {@code double} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void multiplicationTable() {

        double number = Input.inputNumberDouble("a");
        int limit = Input.inputNumberInt("the table limit");

        int i = 1;
        while (i <= limit) {
            System.out.printf("%.2f * %d = %.2f\n", number, i, number * i);
            i++;
        }
    }
}
