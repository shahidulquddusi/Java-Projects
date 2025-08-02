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
    static void isArmstrong10PowN() {

        int number = numberInput;
        boolean isPositive = Calculate.isPositive;

        if (isPositive) {
            if (number - sumOfOfDigits10PowN() == 0){
                System.out.printf("Sum of powN of digits is %d; %d is an Armstrong number  - (10PowerN)\n", sumOfOfDigits10PowN(), number);
            } else {
                System.out.printf("Sum of powN of digits is %d; %d is NOT an Armstrong number  - (10PowerN)\n", sumOfOfDigits10PowN(), number);
            }
        } else {
            System.out.printf("Being negative, %d is NOT an Armstrong number  - (10PowerN)\n", number);
        }
    }

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
    static void isArmstrongModulus10() {

        int number = numberInput;
        boolean isPositive = Calculate.isPositive;

        if (isPositive) {
            if (number - sumOfOfDigitsModulus10() == 0){
                System.out.printf("Sum of powN of digits is %d; %d is an Armstrong number  - (Modulus10)\n", sumOfOfDigitsModulus10(), number);
            } else {
                System.out.printf("Sum of powN of digits is %d; %d is NOT an Armstrong number  - (Modulus10)\n", sumOfOfDigitsModulus10(), number);
            }
        } else {
            System.out.printf("Being negative, %d is NOT an Armstrong number  - (Modulus10)\n", number);
        }
    }


    // derived from SumOfDigits
    static int sumOfOfDigits10PowN(){

        int number = numberInput;
        int numberLength = Calculate.numberLength;
//        boolean isPositive = Calculate.isPositive;

        int divisorPower = Math.min(numberLength-1, 9);

        int divResult;
        int sumOfOfDigits = 0;

        int divisor = (int) Math.pow(10, divisorPower);
        while (divisor >= 1) {
            divResult = number / divisor;
            number -= (divResult * divisor);
            sumOfOfDigits += (int) Math.pow (divResult , numberLength );
            divisor /= 10;
        }
        return sumOfOfDigits;
    }

    static int sumOfOfDigitsModulus10(){

        int number = numberInput, digit = 0;
        int numberLength = Calculate.numberLength;

        int sumOfOfDigits = 0;

        while (number >= 1) {
            digit = number % 10;
            sumOfOfDigits += (int) Math.pow (digit, numberLength );
            number /= 10;
        }
        return sumOfOfDigits;
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
    static void isPalindrome10PowN() {

        int number = numberInput;
        boolean isPositive = Calculate.isPositive;

        if (isPositive) {
            if (number - reverseDigits10PowN() == 0){
                System.out.printf("Reversed as %d; %d is a Palindrome number  - (10PowerN)\n", reverseDigits10PowN(), number);
            } else {
                System.out.printf("Reversed as %d; %d is NOT a Palindrome number  - (10PowerN)\n", reverseDigits10PowN(), number);
            }
        } else {
            System.out.printf("Being negative, %d is NOT a Palindrome number  - (10PowerN)\n", number);
        }

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
    static void isPalindromeModulus10() {

        int number = numberInput;
        boolean isPositive = Calculate.isPositive;

        if (isPositive) {
            if (number - reverseDigitsModulus10() == 0){
                System.out.printf("Reversed as %d; %d is a Palindrome number  - (Modulus10)\n", reverseDigitsModulus10(), number);
            } else {
                System.out.printf("Reversed as %d; %d is NOT a Palindrome number  - (Modulus10)\n", reverseDigitsModulus10(), number);
            }
        } else {
            System.out.printf("Being negative, %d is NOT a Palindrome number  - (Modulus10)\n", number);
        }

    }

    static int reverseDigits10PowN(){

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

    static int reverseDigitsModulus10(){

        int number = numberInput, digit;

        int reversedNumber = 0;
        while (number >= 1) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

}
