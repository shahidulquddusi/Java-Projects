import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("For Simple Growth press 's' and for Compound Growth press 'c': ");
        String choice = input.nextLine().toUpperCase();

        if (choice.equals("S")) {
            Calculate.simpleGrowth();
        }
        else if (choice.equals("C")) {
            Calculate.compGrowthAnnual();
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
