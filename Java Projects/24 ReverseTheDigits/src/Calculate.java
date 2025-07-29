import java.util.ArrayList;
import java.util.List;

public class Calculate {

    static int number = Input.inputNumber("a number");

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
    static void reverseTheDigits(){
    // derived from SumOfDigits method

        int strLength = Integer.toString(number).length();

        // 'divisorPower' will be used as 'Power of 10' of divisor
        // as 10^10 will give 2147483647 for int_limit
        // int max limit (power of 10) is 9
        int divisorPower = Math.min(strLength-1, 9);

        int divResult;
//        int sumOfDigits = 0;

        List<Integer> digits = new ArrayList<>();

        int divisor = (int) Math.pow(10, divisorPower);
        while (divisor >= 1) {              // counter
            divResult = number / divisor;
            number -= (divResult * divisor);    // decrement of original number
//            sumOfDigits += divResult;   // stores divResults b4 next round (+increment)
            digits.addFirst(divResult);
            divisor /= 10;              // decrement of counter (divisor)
        }

        System.out.print("Reverse digits are: ");
        for ( int digit : digits ) {
            System.out.printf("%d", digit);
        }
        System.out.println();
    }

}
