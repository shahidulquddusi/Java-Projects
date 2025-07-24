import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Conditions: for discountRate
        1. If age < 5, then always 75%      [female discount won't add up]
        2. If female, then 50%
        3. If age > 60, then 25%            [female discount will add up]
        4. Else no discount
        */
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false): ");
        boolean isFemale = input.nextBoolean();

        float discountRate;

        try {
            if (age < 5 || (age > 60 && isFemale)) { //'OR cond.' moved from below
                discountRate = 75f;
                System.out.printf("Your have got %.2f%% discount.\n",discountRate);
//            } else if (age > 60 && isFemale) {
//                discountRate = 50f + 25f;//moved above as 'OR cond.' (as both are 75f)
//                System.out.printf("Your have got %.2f%% discount.\n",discountRate);
            } else if (age > 60 /* && !isFemale*/|| isFemale) { //'OR cond.' moved from below
                discountRate = 50f;//alt of (age > 60 && isFemale) is (age > 60)
                System.out.printf("Your have got %.2f%% discount.\n",discountRate);
//            } else if (isFemale) {//moved above as 'OR condition' (as both are 50f)
//                discountRate = 50f;
//                System.out.printf("Your have got %.2f%% discount.\n",discountRate);
            } else {
                discountRate = 0f;
                System.out.printf("Your have got %.2f%% discount.\n",discountRate);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
