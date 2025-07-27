public class Calculate {

    /**
     * A simple method that adds two numbers.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void add() {

        double numOne, numTwo, sumResult;

        numOne = Input.inputNumber("the first");
        numTwo = Input.inputNumber("the second");

        sumResult = numOne + numTwo;
        System.out.printf("The sum is: %.2f\n", sumResult);
    }
}
