public class Calculate {

    static int numberInput = Input.inputNumber("a");

    /**
     * A simple method that calculates {@code summation}
     * of {@code digits} of a {@code number}
     * using {@code loop}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void sumOfDigits10PowN() {

        int number = numberInput;
        int strLength = Integer.toString(number).length();

        // divisorPower will be used as 'Power of 10' of divisor
        // as 10^10 will give 2147483647 for int_limit
        // int max limit (power of 10) is 9
        int divisorPower = Math.min(strLength-1, 9);

        int divResult;
        int sumOfDigits = 0;

        int divisor = (int) Math.pow(10, divisorPower);    // int max limit (power of 10)
        while (divisor >= 1) {              // counter
            divResult = number / divisor;
            number -= (divResult * divisor);    // decrement of original number
            sumOfDigits += divResult;   // stores divResults b4 next round (+increment)
            divisor /= 10;              // decrement of counter (divisor)
        }
        System.out.printf("Sum of digits is: %d\t(void - 10PowerN)\n", Math.abs(sumOfDigits));
    }

    /**
     * A simple method that calculates {@code summation}
     * of {@code digits} of a {@code number}
     * using {@code loop}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code int}</span>
     */
    static int sumOfDigits10PowNInt() {

        int number = numberInput;
        int strLength = Integer.toString(number).length();

        int divisorPower = Math.min(strLength-1, 9);

        int divResult;
        int sumOfDigits = 0;

        int divisor = (int) Math.pow(10, divisorPower);    // int max limit (power of 10)
        while (divisor >= 1) {              // counter
            divResult = number / divisor;
            number -= (divResult * divisor);    // decrement of original number
            sumOfDigits += divResult;   // stores divResults b4 next round (+increment)
            divisor /= 10;              // decrement of counter (divisor)
        }
        return Math.abs(sumOfDigits);
    }

    /**
     * A simple method that calculates {@code summation}
     * of {@code digits} of a {@code number}
     * using {@code loop}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void sumOfDigitsModulus10() {

        int number = numberInput;

        int sumOfDigits = 0;

        while (Math.abs(number) > 0) {              // counter
            sumOfDigits += number % 10;
            number /= 10;
        }
        System.out.printf("Sum of digits is: %d\t(void - Modulus10)\n",
                Math.abs(sumOfDigits));
    }

    /**
     * A simple method that calculates {@code summation}
     * of {@code digits} of a {@code number}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type for calculation.
     * It validates the input with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void sumOfDigitsRawFormula() {

        int number = numberInput;

        /*
        try { // try-catch is replaced with inputNumber()
            number = Input.inputNumber("a");
        } catch (InputMismatchException e) {
            System.out.println("Not integer or too big! Try again.");
        }
        */

        int ones, tens, hundreds, thous, tenThous, hundThous, mills,
                tenMills, hundMills, bills;

        bills = number / 1000000000;

        hundMills = (number
                - 1000000000 * bills) / 100000000;

        tenMills = (number
                - 1000000000 * bills
                - 100000000 * hundMills) / 10000000;

        mills = (number
                - 1000000000 * bills
                - 100000000 * hundMills
                - 10000000 * tenMills) / 1000000;

        hundThous = (number
                - 1000000000 * bills
                - 100000000 * hundMills
                - 10000000 * tenMills
                - 1000000 * mills) / 100000;

        tenThous = (number
                - 1000000000 * bills
                - 100000000 * hundMills
                - 10000000 * tenMills
                - 1000000 * mills
                - 100000 * hundThous) / 10000;

        thous = (number
                - 1000000000 * bills
                - 100000000 * hundMills
                - 10000000 * tenMills
                - 1000000 * mills
                - 100000 * hundThous
                - 10000 * tenThous) / 1000;

        hundreds = (number
                - 1000000000 * bills
                - 100000000 * hundMills
                - 10000000 * tenMills
                - 1000000 * mills
                - 100000 * hundThous
                - 10000 * tenThous
                - 1000 * thous) / 100;

        tens = (number
                - 1000000000 * bills
                - 100000000 * hundMills
                - 10000000 * tenMills
                - 1000000 * mills
                - 100000 * hundThous
                - 10000 * tenThous
                - 1000 * thous
                - 100 * hundreds) / 10;

        ones = (number
                - 1000000000 * bills
                - 100000000 * hundMills
                - 10000000 * tenMills
                - 1000000 * mills
                - 100000 * hundThous
                - 10000 * tenThous
                - 1000 * thous
                - 100 * hundreds
                - 10 * tens);

        int sumOfDigits = Math.abs(bills + hundMills + tenMills + mills + hundThous +
                tenThous + thous + hundreds + tens + ones);

        if (number < 2147483647) {
            System.out.printf("Sum of digits is: %d\t(void - raw formula)\n",
                    sumOfDigits);
        }
//        else { // int - inputNumber() method handles this exception
//            System.out.printf("Please enter a number below %d (2.147 Billion).\n",
//                    Integer.MAX_VALUE);
//        }

    }
}
