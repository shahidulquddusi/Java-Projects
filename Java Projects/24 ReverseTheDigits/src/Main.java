public class Main {

    public static void main(String[] args) {

        // Press 'Run'
        System.out.printf("Reversed digits are: %d   (long - 10PowN)\n",
                Calculate.reverseDigits10PowN());
        System.out.printf("Reversed digits are: %d   (long - Modulus10)\n",
                Calculate.reverseDigitsModulus10());
        Calculate.reverseDigits10PowNVoid();

        // This file contains 'DOCUMENTATION' for methods
        // Hover your mouse over the method name to see details

        /*          -- Output Sample --
        Please enter a number: -123456
        Reversed digits are: -654321   (long - 10PowN)
        Reversed digits are: -654321   (long - Modulus10)
        Reversed digits are: -654321   (void method)

        Please enter a number: 1122334455
        Reversed digits are: 5544332211   (long - 10PowN)
        Reversed digits are: 5544332211   (long - Modulus10)
        Reversed digits are: 5544332211   (void method)

        Reversed digits are: 1244332211   (long - 10PowN)
        Reversed digits are: 1244332211   (long - Modulus10)
        Reversed digits are: 1244332211   (void method)
        */
    }
}