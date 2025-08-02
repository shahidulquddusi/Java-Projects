import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // This file contains 'DOCUMENTATION' for methods
        // Hover your mouse over the method name to see details

        // Press 'Run'
        Scanner input = new Scanner(System.in);
        System.out.print("For Simple Growth press 's' and for Compound Growth press 'c': ");
        String choice = input.nextLine().toUpperCase();

        if (choice.equals("S")) {
            Finance.simpleGrowth();
        }
        else if (choice.equals("C")) {
            Finance.compGrowthAnnual();
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }

        /*                  -- Output Sample --
        For Simple Growth press 's' and for Compound Growth press 'c': c
        Please insert required inputs for 'Compound Growth' calculation.
        Please enter the rate of growth (%): a
        Not a number. Re-enter the rate of growth (%): 12.5
        Please enter the principal amount: s
        Not a number. Re-enter the principal amount: 1000.50
        Please enter number of years: 2.5
        Total increased amount (compound growth) is: 342.57
        Total Future Value (compound growth) is: 1343.07

        For Simple Growth press 's' and for Compound Growth press 'c': s
        Please insert required inputs for 'Simple Growth' calculation.
        Please enter the rate of growth (%): a
        Not a number. Re-enter the rate of growth (%): 10.5
        Please enter the principal amount: d
        Not a number. Re-enter the principal amount: 1000.50
        Please enter number of years: 2.5
        Total increased amount (simple growth) is: 262.63
        Total Future Value (simple growth) is: 1263.13
        */
    }
}
