import java.util.Scanner;

public class Input {
    /**
     * A simple method that validates and then accepts number of {@code integer} type as input with recursive request.
     * The method uses {@code Scanner} to receive input.
     * <br><br>The string {@code param} </@code>, <span style="color: #6198d4;">{@code name}</span>, is to facilitate the prompt.
     *
     * @param name
     * @return <span style="color: #6198d4;">{@code int}</span>
     */
    static int inputNumberInt(String name) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter %s number: ", name);
        int number;

        while (true) {
            if (input.hasNextInt()) {
                number = input.nextInt();
                input.nextLine(); // removable
                return number;
            } else {
                System.out.printf("Not an integer.Re-enter %s number: ", name);
                input.nextLine(); // stops infinite loop - Consumes invalid input
            }
        }
    }

    /**
     * A simple method that validates and then accepts number of {@code double} type as input with recursive request.
     * The method uses {@code Scanner} to receive input.
     * <br><br>The string {@code param} </@code>, <span style="color: #6198d4;">{@code name}</span>, is to facilitate the prompt.
     *
     * @param name
     * @return <span style="color: #6198d4;">{@code double}</span>
     */
    static double inputNumberDouble(String name) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter %s number: ", name);
        double number;

        while (true) {
            if (input.hasNextDouble()) {
                number = input.nextDouble();
                input.nextLine(); // removable
                return number;
            } else {
                System.out.printf("Not a number. Re-enter %s number: ", name);
                input.nextLine(); // stops infinite loop - Consumes invalid input
            }
        }
    }
}
