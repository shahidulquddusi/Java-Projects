class Finance {

    static double growthRate;
    static double principal;
    static double numOfYears;

    static void insertInput(){

        growthRate = Input.inputNumber("the rate of growth (%)");
        principal = Input.inputNumber("the principal amount");
        numOfYears = Input.inputNumber("number of years");
    }

    /**
     * A simple method that calculates {@code simple growth} values over years.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void simpleGrowth(){

        System.out.println("Please insert required inputs for 'Simple Growth' calculation.");

        insertInput();
        SimpleGrowth simpleGrowth = new SimpleGrowth(growthRate, principal, numOfYears);

        System.out.printf("Total increased amount (simple growth) is: %.2f\n", simpleGrowth.totalGrowth());
        System.out.printf("Total Future Value (simple growth) is: %.2f\n", simpleGrowth.futureValue());
    }

    /**
     * A simple method that calculates {@code compounded annual growth}
     * values over years.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void compGrowthAnnual(){

        System.out.println("Please insert required inputs for 'Compound Growth' calculation.");

        insertInput();
        CompGrowthAnnual compGrowthAnnual = new CompGrowthAnnual(growthRate, principal, numOfYears);

        System.out.printf("Total increased amount (compound growth) is: %.2f\n", compGrowthAnnual.totalGrowth());
        System.out.printf("Total Future Value (compound growth) is: %.2f\n", compGrowthAnnual.futureValue());
    }
}
