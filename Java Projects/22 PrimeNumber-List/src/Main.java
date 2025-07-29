
public class Main {

    public static void main(String[] args) {

        // This file contains 'DOCUMENTATION' for methods
        // Hover your mouse over the method name to see details

        //Press 'Run'
        Calculate.isPrimeNumber();  // (void - a)

        //--TODO-- could not output a 'prime number' successfully
        Calculate.notPrimeNumberOnly(); // (void - b - only 'non' prime) partially done

        Calculate.primeNumUpToN();      // (uses List<>)
        Calculate.notPrimeUpToNVoid();  // (void)

        /*      -- Output Sample --
        Please enter a number: l
        Not an integer. Re-enter a number: 10
        10 is not a prime number. (void - a)
        10 is not a prime number. (void - b - only 'non' prime)
        Prime numbers up to 10 are: (List<>)
        1, 2, 3, 5, 7, Prime numbers.
        4, 6, 8, 9, are non-prime numbers. (void)

        Please enter a number: 857
        857 is a prime number.

        Please enter a number: 135462
        135462 is not a prime number.

        Please enter a number: 67
        67 is a prime number.
        */

    }
}