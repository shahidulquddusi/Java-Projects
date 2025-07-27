public class Calculate {
    /**
     * A simple method that divides two {@code integer} values
     * and returns result with {@code decimal} values.
     * <br><br> The method takes {@code user input}.
     * It validates the input with recursive request.
     *
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void divideInt() {

        int firstInt, secondInt;

        firstInt = Input.inputNumber("the first");
        secondInt = Input.inputNumber("the second");

        int divideResult = firstInt / secondInt;
        float castedDivideResult = (float) firstInt / (float) secondInt;
        System.out.println("The result of division of int is\t\t\t: " + divideResult);
        System.out.printf("The result of division of int (cast to float) is: %.2f\n",
                castedDivideResult);
    }
}
