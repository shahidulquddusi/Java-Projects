public class Calculate {

    static int nThNumber = Input.inputNumber("the n-th");
    static int i;

    /**
     * A simple method that calculates {@code summation}
     * of {@code odd numbers} up to {@code n-th limit}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    public static void sumOfOddRawFormula() {

        if (nThNumber > 0) { // Positive number protection

            // Grand Total: Raw formula
            double sumOfOdd = Math.pow(Math.ceilDiv(nThNumber, 2), 2);
            System.out.printf("Sum of odd up to %d is: %1.0f\n",
                    nThNumber, sumOfOdd);
        }
    }

    /**
     * A simple method that calculates {@code summation}
     * of {@code odd numbers} up to {@code n-th limit}
     * using {@code loop}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    public static void sumOfOddLoop() {

        if (nThNumber > 0) {

            // Grand Total: using loop
            int i = 1; // 1 since after increment it should remain odd
            double sumOfOdd = 0; // value reassigned to remove previous value
            while (i <= nThNumber) {
                sumOfOdd += i;
                i += 2; // i = i + 2    (to satisfy odd)
            }
            System.out.printf("Using loop the sum is: %1.0f\n", sumOfOdd);
        }
    }

    /**
     * A simple method that calculates {@code summation}
     * of {@code odd numbers} up to {@code n-th limit}
     * using {@code Arithmetic Progression(AP)} formula.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    public static void sumOfOddAPFormula() {

        if (nThNumber > 0) {

            // Grand Total: Arithmetic Progression (AP) formula:
            double sumOfOddArSeq;
            if (nThNumber % 2 != 0) {
                sumOfOddArSeq = (double) (1 + nThNumber) / 2 * Math.ceilDiv(nThNumber, 2);
            } else {
                sumOfOddArSeq = (double) nThNumber / 2 * Math.ceilDiv(nThNumber, 2);
            }

            System.out.printf("Using AP formula sum is: %1.0f\n", sumOfOddArSeq);
        }
    }

    /**
     * A simple method that {@code illustrates} the {@code summation}
     * of {@code odd numbers} up to {@code n-th limit}
     * using {@code loop} for every next step of calculation.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    public static void sumOfOddIllustration() {

        if (nThNumber > 0) {

            System.out.println("\nIllustration is below:");

            // Totals: Raw formula (illustration)
            i = 1; // 'i' reassigned to remove previous value
            while (i <= nThNumber) {
                double sumOfOddLoop = Math.pow(Math.ceilDiv(i, 2), 2);
                System.out.printf("Sum of odd up to %d:   \t%1.0f\n",
                        i, sumOfOddLoop);
                i += 2;
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}
