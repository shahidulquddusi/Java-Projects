public class Finance {

    /**
     * A simple method that calculates {@code compounded annual growth}
     * values over years.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void compoundGrowthAnnul() {

        double growthRate, principal, numOfYears,
                totalGrowth, futureValue;

        growthRate = Input.inputNumber("the rate of growth (%)");
        principal = Input.inputNumber("the principal amount");
        numOfYears = Input.inputNumber("the number of years");

        totalGrowth = principal * (Math.pow(1 + growthRate / 100, numOfYears) - 1);
        futureValue = principal * Math.pow(1 + growthRate / 100, numOfYears);

        System.out.printf("Total increased amount (compounded annually) " +
                "is: %.2f\n", totalGrowth);
        System.out.printf("Total Future Value (compounded annually) " +
                "is: %.2f\n", futureValue);
    }
}
