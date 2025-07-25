import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        int factorial = 1;
        int i = 1;
        while (i<= n){
                factorial *= i;
                i++;
            }

        System.out.printf("The factorial of %d is %d\n", n, factorial);

        /*
        Output sample:

        Please enter a number: 5
        The factorial of 5 is 120

        Please enter a number: 8
        The factorial of 8 is 40320

        */
    }
}