class Finance {

    static float growthRate;
    static double principal;
    static float periodInYears;

    static void insertInput(){

        growthRate = Input.inputFloat("the rate of growth (%)");
        principal = Input.inputDouble("the principal amount");
        periodInYears = Input.inputFloat("the number of years");
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
        SimpleGrowth simpleGrowth = new SimpleGrowth(growthRate, principal, periodInYears);

        System.out.printf("Total increased amount (simple growth) is: %.2f\n",
                simpleGrowth.totalGrowth());
        System.out.printf("Total Future Value (simple growth) is: %.2f\n",
                simpleGrowth.futureValue());
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
        CompGrowthAnnual compGrowthAnnual = new CompGrowthAnnual(growthRate, principal, periodInYears);

        System.out.printf("Total increased amount (compound growth) is: %.2f\n",
                compGrowthAnnual.totalGrowth());
        System.out.printf("Total Future Value (compound growth) is: %.2f\n",
                compGrowthAnnual.futureValue());
    }
}
