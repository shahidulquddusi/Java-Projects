public class Main {

    public static void main(String[] args) {

        // Press 'Run'
        System.out.printf("""
                        Reverse digits are: %d   (int)\s
                        "CAUTION: If unexpected negative, Check for Integer.Max_Value"
                        """,
                Calculate.reversedDigitsInt());
        Calculate.reversedDigitsVoid();



        // This file contains 'DOCUMENTATION' for methods
        // Hover your mouse over the method name to see details

        /*          -- Output Sample --
        Please enter a number: -123456
        Reverse digits are: -654321   (void method)
        Reverse digits are: -654321   (int)

        Please enter a number: 1122334455
        Reverse digits are: 5544332211   (void method)
        Reverse digits are: -1603151438   (int)   """ due to Integer.Max_Value limit """
        "CAUTION: If unexpected negative, Check for Integer.Max_Value"

        Please enter a number: 1122334421
        Reverse digits are: 1244332211   (void method)
        Reverse digits are: 1244332211   (int)
        */
    }
}