public class Calculate {

    static int numberInput = Input.inputNumber("a");

    static int numberLength = Integer.toString(numberInput).length();
    static boolean isPositive = numberInput > 0;

    /**
     * A simple method that determines whether a {@code number} of {@code integer} type is
     * <span style="color: #6198d4;">{@code Armstrong}</span> or not.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code loop}</span>
     * for {@code iteration} issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // 153 = 1^3 + 5^3 + 3^3
    // 1634 = 1^4 + 6^4 + 3^4 + 4^4
    static void isArmstrongNumber() {

        int number = numberInput;
        boolean isPositive = Calculate.isPositive;

        if (isPositive) {
            if (number - sumOfPowerNOfDigits() == 0){
                System.out.printf("Sum Of PowerN of Digits is %d; %d is an Armstrong number \n", sumOfPowerNOfDigits(), number);
            } else {
                System.out.printf("Sum Of PowerN of Digits is %d; %d is NOT an Armstrong number \n", sumOfPowerNOfDigits(), number);
            }
        } else {
            System.out.printf("Being negative, %d is NOT an Armstrong number \n", number);
        }
    }


    // derived from SumOfDigits
    static int sumOfPowerNOfDigits(){

        int number = numberInput;
        int numberLength = Calculate.numberLength;
//        boolean isPositive = Calculate.isPositive;

        int divisorPower = Math.min(numberLength-1, 9);

        int divResult;
        int sumOfDigitsCube = 0;

        int divisor = (int) Math.pow(10, divisorPower);
        while (divisor >= 1) {
            divResult = number / divisor;
            number -= (divResult * divisor);
            sumOfDigitsCube += (int) Math.pow (divResult , numberLength );
            divisor /= 10;
        }
        return sumOfDigitsCube;
        //        System.out.printf("Sum of digits (loop) is: %d\n", sumOfDigitsCube);
    }

    /**
     * A simple method that determines whether a {@code number} of {@code integer} type is
     * <span style="color: #6198d4;">{@code Palindrome}</span> or not.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code loop}</span>
     * for {@code iteration} issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // 121, 1331, 14641
    static void isPalindromeNumber() {

        int number = numberInput;
        boolean isPositive = Calculate.isPositive;

        if (isPositive) {
            if (number - reverseDigitInt() == 0){
                System.out.printf("Reversed as %d; %d is a Palindrome number \n", reverseDigitInt(), number);
            } else {
                System.out.printf("Reversed as %d; %d is NOT a Palindrome number \n", reverseDigitInt(), number);
            }
        } else {
            System.out.printf("Being negative, %d is NOT a Palindrome number \n", number);
        }

    }

    static int reverseDigitInt(){

        int number = numberInput;

        int numberLength = Calculate.numberLength;
        boolean isPositive = Calculate.isPositive;

        int divisorPower;
        if(isPositive){
            divisorPower = Math.min(numberLength-1, 9);
        } else {
            divisorPower = Math.min(numberLength-2, 8);
        }

        int k = 0;
        int reversedNumber = 0;
        int divisor = (int) Math.pow(10, divisorPower);
        while (divisor >= 1) {
            int divResult = number / divisor;
            number -= (divResult * divisor);
            reversedNumber += (int) (divResult * Math.pow(10, k));
            k++;
            divisor /= 10;
        }

        return reversedNumber;
    }
}
