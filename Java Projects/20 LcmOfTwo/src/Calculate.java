public class Calculate {
    /**
     * A simple method that calculates the
     * least common multiple (LCM) of two integers.
     * <br><br> The method takes {@code user input}.
     * It validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void lcm() {

        int numberA, numberB, greater;

        numberA = Input.inputNumber("the first");
        numberB = Input.inputNumber("the second");

        boolean isPositive = numberA > 0 && numberB > 0;

        if (numberA > numberB) {
            greater = numberA;
        } else {
            greater = numberB;
        }

        if (isPositive) {
            int i = greater;
            while (i <= numberA * numberB) {
                if ((i % numberA == 0) && (i % numberB == 0)) {
                    System.out.printf("The least common multiple (LCM) is %d\n", i);
                    break;
                }
                i += greater;
            }
        } else {
            System.out.println("Please enter positive numbers only.");
        }
    }
}
