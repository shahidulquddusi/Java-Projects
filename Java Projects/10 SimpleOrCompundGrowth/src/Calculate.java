import java.util.Scanner;

class Calculate {

    static Scanner input = new Scanner(System.in);

    static float growthRate;
    static long principal;
    static float numOfYears;

    static void simpleGrowth(){

        System.out.println("Please insert required inputs for 'Simple Growth' calculation.");

        insertInput();
        SimpleGrowth simpleGrowth = new SimpleGrowth(growthRate, principal, numOfYears);

        System.out.printf("Total increased amount (simple growth) is: %.2f\n", simpleGrowth.totalGrowth());
        System.out.printf("Total Future Value (simple growth) is: %.2f\n", simpleGrowth.futureValue());
    }

    static void compGrowthAnnual(){

        System.out.println("Please insert required inputs for 'Compound Growth' calculation.");

        insertInput();
        CompGrowthAnnual compGrowthAnnual = new CompGrowthAnnual(growthRate, principal, numOfYears);

        System.out.printf("Total increased amount (compound growth) is: %.2f\n", compGrowthAnnual.totalGrowth());
        System.out.printf("Total Future Value (compound growth) is: %.2f\n", compGrowthAnnual.futureValue());
    }

    static void insertInput(){

        System.out.print("Please enter the rate of growth: ");
        growthRate = input.nextFloat();
        System.out.print("Please enter the principal amount: ");
        principal = input.nextLong();
        System.out.print("Please enter number of years: ");
        numOfYears = input.nextFloat();
    }
}
