public class Calculate {

    static int n = Input.inputNumber("the n-th");

    /**
     * A simple method that calculates {@code factorial}
     * of any {@code integer} values.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     *  <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // with incrementing iteration
    public static void factorial() {

        int n = Calculate.n; //Input.inputNumber("the n-th");

        if (n > 0) {
            double factorial = 1;  // factorial and "i" can't be zero
            int i = 1;          // as multiplication will turn into zero
            while (i <= n) {
                    factorial *= i;
                i++;
            }
            System.out.printf("The factorial of %d is %.0f\n", n, factorial);
        } else {
            System.out.println("Please enter a positive number");
        }
    }

    /**
     * A simple method that calculates {@code factorial}
     * of any {@code integer} values.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     *  <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // with decrementing iteration
    public static void factorialDecrementing() {

        int n = Calculate.n; // Input.inputNumber("the n-th");

        if (n > 0) {
            double factorial = 1;  // factorial and "i" can't be zero
            int i = n;          // as multiplication will turn into zero
            while (i > 0) {
                factorial *= i;
                i--;
            }
            System.out.printf("The factorial of %d is %.0f (decrementing)\n",
                    n, factorial);
        } else {
            System.out.println("Please enter a positive number");
        }
    }
}
