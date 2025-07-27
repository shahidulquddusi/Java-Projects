public class Calculate {

    /**
     * A simple method that calculates the {@code greatest of three}
     * numbers.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void greatestOfThree() {

        double firstNum, secondNum, thirdNum;

        System.out.println("Please enter 3 numbers.");
        firstNum = Input.inputNumber("the first");
        secondNum = Input.inputNumber("the second");
        ;
        thirdNum = Input.inputNumber("the third");
        ;

//        if (firstNum>secondNum && firstNum>thirdNum) { //Same output
        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.printf("The greatest number is: %.2f\n",
                    firstNum);
        } else {
            System.out.printf("The greatest number is: %.2f\n",
                    Math.max(secondNum, thirdNum));
        }

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
