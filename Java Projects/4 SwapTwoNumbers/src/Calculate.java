public class Calculate {
    /**
     * A simple method than swaps values of two number variables
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     *
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void swap() {

        double firstNumber, secondNumber, helperNumber;

        firstNumber = Input.inputNumber("the first");
        secondNumber = Input.inputNumber("the second");

        //swap
        helperNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = helperNumber;

        System.out.println("After swap:\nFirst Number is: " + firstNumber
                + "\nSecond Number is: " + secondNumber);
    }
}
