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
    static int inputNumber(String name) {
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
     * A simple method that validates and then accepts {@code boolean} input with recursive request.
     * The method uses {@code Scanner} to receive input.
     * <br><br>The string {@code param} </@code>, <span style="color: #6198d4;">{@code name}</span>, is to facilitate the prompt.
     *
     * @param name
     * @return <span style="color: #6198d4;">{@code boolean}</span>
     */
    static boolean inputBoolean(String name) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Are you a %s? (true/false): ", name);
        boolean response;

        while (true) {
            if (input.hasNextBoolean()) {
                response = input.nextBoolean();
                input.nextLine(); // removable
                return response;
            } else {
                System.out.printf("Invalid input! Are you a %s?" +
                        "\nEnter true or false: ", name);
                input.nextLine(); // stops infinite loop - Consumes invalid input
            }
        }
    }
}
