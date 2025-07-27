public class Calculate {

    /**
     * A simple method that calculates {@code factorial}
     * of any {@code integer} values.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     *  <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    public static void factorial() {

        int n = Input.inputNumber("the n-th");

        if (n > 0) {
            int factorial = 1;  // factorial and "i" can't be zero
            int i = 1;          // as multiplication will turn into zero
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.printf("The factorial of %d is %d\n", n, factorial);
        } else {
            System.out.println("Please enter a positive number");
        }
    }
}
