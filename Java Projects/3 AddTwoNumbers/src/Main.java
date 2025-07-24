import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        int numOne = input.nextInt();
        System.out.print("Please enter your second number: ");
        int numTwo = input.nextInt();
        int sumResult = numOne + numTwo;
        System.out.println("The sum is: " + sumResult);
    }
}