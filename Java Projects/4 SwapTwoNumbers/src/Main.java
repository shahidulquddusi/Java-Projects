import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int helperNumber;
        System.out.print("Please enter the First Number: ");
        firstNumber = input.nextInt();

        System.out.print("Please enter the Second Number: ");
        secondNumber = input.nextInt();

        //swap
        helperNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = helperNumber;

        System.out.println("After swap:\nFirst Number is: " + firstNumber
                +"\nSecond Number is: " + secondNumber);
    }
}