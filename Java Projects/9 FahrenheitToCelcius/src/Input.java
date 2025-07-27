import java.util.Scanner;

public class Input {
    /**
     * A simple method that validates and then accepts number of {@code float} type as input with recursive request.
     * The method uses {@code Scanner} to receive input.
     * <br><br>The string {@code param} </@code>, <span style="color: #6198d4;">{@code name}</span>, is to facilitate the prompt.
     *
     * @param name
     * @return <span style="color: #6198d4;">{@code float}</span>
     */
    static float inputNumber(String name) {
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
}
