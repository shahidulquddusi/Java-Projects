import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numOne = inputNumber();
        int numTwo = inputNumber();

        int sumResult = numOne + numTwo;
        System.out.println("The sum is: " + sumResult);
    }

    public static int inputNumber(){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            return input.nextInt();
    }
}