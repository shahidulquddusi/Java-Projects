import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers.");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();

//        if (firstNum>secondNum && firstNum>thirdNum) { //Same output
        if (firstNum>=secondNum && firstNum>=thirdNum) {
            System.out.printf("The greatest number is: %d\n",
                    firstNum);
        } else {
            System.out.printf("The greatest number is: %d\n",
                    Math.max(secondNum, thirdNum));
        }

        /*
        Output Sample:
        Please enter 3 numbers.
        2
        3
        1
        The greatest number is: 3
        */

        /*
        Note: below conditions are replaced with else condition above
        } else if (secondNum>thirdNum){
            System.out.printf("The greatest number is: %d\n",
                    secondNum);
        } else {
            System.out.printf("The greatest number is: %d\n",
                    thirdNum);
        }
        */
    }
}
