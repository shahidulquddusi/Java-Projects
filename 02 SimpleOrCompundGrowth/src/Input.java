import java.util.Scanner;

public class Input {

    /**
     * A simple method that validates and then accepts number of {@code integer} type as input with recursive request.
     * The method uses {@code Scanner} to receive input.
     * <br><br>The string {@code param} </@code>, <span style="color: #6198d4;">{@code name}</span>, is to facilitate the prompt.
     *
     * @param name
     * @return <span style="color: #6198d4;">{@code integer}</span>
     */
    static int inputInt(String name) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter %s: ", name);
        int number;

        while (true) {
            if (input.hasNextInt()) {
                number = input.nextInt();
                input.nextLine(); // removable
                return number;
            } else {
                System.out.printf("Not an integer. Re-enter %s: ", name);
                input.nextLine(); // stops infinite loop - Consumes invalid input
            }
        }
    }

    /**
     * A simple method that validates and then accepts number of {@code long} type as input with recursive request.
     * The method uses {@code Scanner} to receive input.
     * <br><br>The string {@code param} </@code>, <span style="color: #6198d4;">{@code name}</span>, is to facilitate the prompt.
     *
     * @param name
     * @return <span style="color: #6198d4;">{@code long}</span>
     */
    static long inputLong(String name) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter %s: ", name);
        long number;

        while (true) {
            if (input.hasNextLong()) {
                number = input.nextLong();
                input.nextLine(); // removable
                return number;
            } else {
                System.out.printf("Not a number (long type). Re-enter %s: ", name);
                input.nextLine(); // stops infinite loop - Consumes invalid input
            }
        }
    }

    /**
     * A simple method that validates and then accepts number of {@code float} type as input with recursive request.
     * The method uses {@code Scanner} to receive input.
     * <br><br>The string {@code param} </@code>, <span style="color: #6198d4;">{@code name}</span>, is to facilitate the prompt.
     *
     * @param name
     * @return <span style="color: #6198d4;">{@code float}</span>
     */
    static float inputFloat(String name) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter %s: ", name);
        float number;

        while (true) {
            if (input.hasNextFloat()) {
                number = input.nextFloat();
                input.nextLine(); // removable
                return number;
            } else {
                System.out.printf("Not a number. Re-enter %s: ", name);
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
    static double inputDouble(String name) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter %s: ", name);
        double number;

        while (true) {
            if (input.hasNextDouble()) {
                number = input.nextDouble();
                input.nextLine(); // removable
                return number;
            } else {
                System.out.printf("Not a number. Re-enter %s: ", name);
                input.nextLine(); // stops infinite loop - Consumes invalid input
            }
        }
    }

}
