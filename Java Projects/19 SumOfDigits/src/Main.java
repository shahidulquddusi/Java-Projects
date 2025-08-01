public class Main {

    public static void main(String[] args) {

        // Press 'Run'
        Calculate.sumOfDigits10PowN();
        System.out.printf("Sum of digits is: %d\t(int - 10PowerN)\n",
                Calculate.sumOfDigits10PowNInt());
        Calculate.sumOfDigitsModulus10();
        Calculate.sumOfDigitsRawFormula();

        // This file contains 'DOCUMENTATION' for methods
        // Hover your mouse over the method name to see details

        /*      -- Output Sample --
        Please enter a number: 12.56
        Not an integer. Re-enter a number: a
        Not an integer. Re-enter a number: 2345632089
        Not an integer. Re-enter a number: 2113654789
        Sum of digits (loop) is: 46
        Sum of digits (raw formula) is: 46

        Please enter a number: 5864
        Sum of digits (loop) is: 23
        Sum of digits (raw formula) is: 23
        */
    }
}