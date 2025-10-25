public class Calculate {

    static int numberA = Input.inputNumber("the first");
    static int numberB= Input.inputNumber("the second");


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

        numberA = Calculate.numberA;
        numberB = Calculate.numberB;

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

    /**
     * A simple method that calculates the
     * least common multiple (LCM) of two integers.
     * <br><br> The method takes {@code user input}.
     * It validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void lcmAlt() {

        int numberA, numberB;

        numberA = Calculate.numberA;
        numberB = Calculate.numberB;

        boolean isPositive = numberA > 0 && numberB > 0;

        if (isPositive) {
            int i = 1;
            while (i <= numberB) { // no need to -- numberA * numberB
                if ((numberA * i) % numberB == 0) {
                    System.out.printf("The least common multiple (LCM) is %d (alt.)\n", (numberA * i));
                    break;
                }
                i ++;
            }
        } else {
            System.out.println("Please enter positive numbers only.");
        }
    }
}
