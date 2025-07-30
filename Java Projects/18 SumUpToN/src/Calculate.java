import java.util.Scanner;

public class Calculate {

    /**
     * A simple method that calculates {@code summation}
     * of {@code numbers} up to {@code n-th limit}
     * using {@code loop}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    public static void sumUpToN() {

        int n = Input.inputNumber("the n-th");

        if (n > 0) {
            int sum = 0, i = 0;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.printf("Sum from 1 up to %d is: %d\n", n, sum);
        } else {
            System.out.println("Please enter a positive number");
        }
    }
}
