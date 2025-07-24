import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float growthRate;
        long principal;
        float numOfYears;

        System.out.print("Please enter the rate of growth: ");
        growthRate = input.nextFloat()/100;

        System.out.print("Please enter the principal amount: ");
        principal = input.nextLong();

        System.out.print("Please enter the number of years: ");
        numOfYears = input.nextFloat();

        double totalGrowth = principal * (Math.pow( 1 + growthRate, numOfYears)-1);
        double futureValue = principal * Math.pow( 1 + growthRate, numOfYears) ;

        System.out.printf("Total increased amount is: %.2f\n", totalGrowth );
        System.out.printf("Total Future Value is: %.2f\n", futureValue );
    }
}