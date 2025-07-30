import java.util.ArrayList;
import java.util.List;

public class Calculate {

    static int numberInput = Input.inputNumber("a number");

    static int numberLength = Integer.toString(numberInput).length();
    static boolean isNegative = numberInput < 0;

    /**
     * A simple method that
     * <span style="color: #6198d4;">{@code reverses digits}</span>
     * of any <span style="color: #6198d4;">{@code number}</span>
     * of {@code integer} type
     * using {@code loop}.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type and
     * validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code int}</span>
     */
    // derived from 'SumOfDigits' method
    static int reversedDigitsInt() {

        int number = numberInput;
        int numberLength = Calculate.numberLength;
        boolean isNegative = Calculate.isNegative;

        int divisorPower;
        if (!isNegative) {
            divisorPower = Math.min(numberLength - 1, 9);
        } else {
            divisorPower = Math.min(numberLength - 2, 8);
        }

        int divResult;
        int reversedNumber = 0;

        int k = 0;
        int divisor = (int) Math.pow(10, divisorPower);
        while (divisor >= 1) {
            divResult = number / divisor;
            number -= (divResult * divisor);
            reversedNumber += (int) (divResult * Math.pow(10, k));
            k++;
            divisor /= 10;
        }
        return reversedNumber;
    }

    /**
     * A simple method that
     * <span style="color: #6198d4;">{@code reverses digits}</span>
     * of any <span style="color: #6198d4;">{@code number}</span>
     * of {@code integer} type
     * using {@code loop} and {@code ArrayList<>()} function.
     * <br><br> The method takes {@code user input}.
     * It accepts number of {@code integer} type and
     * validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // derived from 'SumOfDigits' method
    static void reversedDigitsVoid(){

        int number =numberInput;
        int numberLength = Calculate.numberLength;
        boolean isNegative = Calculate.isNegative;

        int divisorPower;
        if ( !isNegative){
            divisorPower =  Math.min(numberLength-1, 9);
        } else {
            divisorPower = Math.min(numberLength-2, 8);
        }

        List<Integer> digits = new ArrayList<>();

        int divisor = (int) Math.pow(10, divisorPower); //
        while (divisor >= 1) {
            int divResult = number / divisor;
            number -= (divResult * divisor);
            digits.addFirst(Math.abs( divResult ) );
            divisor /= 10;
        }

        System.out.print("Reverse digits are: ");
        if (isNegative) { System.out.print("-"); }
        for ( int digit : digits ) {
                System.out.printf("%d", digit);
        }
        System.out.println("   (void method)");
    }



}
