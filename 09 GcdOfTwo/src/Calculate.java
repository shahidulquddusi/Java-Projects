public class Calculate {
    /**
     * A simple method that calculates the
     * greatest common divisor (GCD) of two integers.
     * <br><br> The method takes {@code user input}.
     * It validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void gcd() {

        int numberA, numberB, smaller;

        numberA = Input.inputNumber("the first");
        numberB = Input.inputNumber("the second");
        smaller = Math.min(numberA, numberB);

        boolean isPositive = numberA > 0 && numberB > 0;

        if (isPositive) {
            int i = smaller;
            while (i>=1) {
                if ((numberA % i == 0) && (numberB % i == 0)){
                    System.out.printf("The greatest common divisor (GCD) is %d\n", i);
                    break;
                }
                i--;
            }
        } else {
            System.out.println("Please enter positive numbers only.");
        }
    }
}
