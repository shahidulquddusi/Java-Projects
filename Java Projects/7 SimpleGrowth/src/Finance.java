public class Finance {

    /**
     * A simple method that calculates {@code simple growth} values over years.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void simpleGrowth() {

        double growthRate, principal, numOfYears,
                totalGrowth, futureValue;

        growthRate = Input.inputNumber("the rate of growth (%)");
        principal = Input.inputNumber("the principal amount");
        numOfYears = Input.inputNumber("the number of years");

        totalGrowth = principal * growthRate / 100 * numOfYears;
        futureValue = principal * (1 + growthRate / 100 * numOfYears);

        System.out.printf("Total increased amount (simple growth) " +
                "is: %.2f\n", totalGrowth);
        System.out.printf("Total Future Value (simple growth) " +
                "is: %.2f\n", futureValue);
    }
}
