import java.util.ArrayList;
import java.util.List;

public class Calculate {
    static int lowerLimit = Input.inputNumber("the lower limit of range");
    static int upperLimit = Input.inputNumber("the upper limit of range");

    /**
     * A <span style="color: #6198d4;">{@code helper}</span> method
     * for finding the {@code list} of
     * <span style="color: #6198d4;">{@code prime number}</span>
     * <span style="color: #6198d4;">{@code in a range}</span>
     * of {@code lower-upper limits}. It internally determines the list of
     * {@code 'non'-prime number} within the range
     *  with {@code no visible output}.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code ArrayList<>()}</span>
     * function for handling list related issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code List<Integer>}</span>
     *  with blank output
     */
    static List<Integer> notPrimeUpToNList() {

        List<Integer> notPrimeList = new ArrayList<>();

        // r can't be the lowerLimit
        // being divisor, r determines the prime number
        for (int i = lowerLimit; i <= upperLimit; i = i + 1) {
            for (int r = 2; r < i; r = r + 1) {
                // in nested for :
                // r < i; here 'i' is moving_lowerLimit
                // moving lowerLimit, i, becomes prime or non-prime
                // after repeated_division (loop division)
                if (i % r == 0) {
                    notPrimeList.add(i);
                    break;
                }
            }
        } return notPrimeList; //return false; //
    }


    /**
     * A simple method that finds the {@code list} of
     * <span style="color: #6198d4;">{@code prime number}</span>
     * <span style="color: #6198d4;">{@code in a range}</span>
     * of {@code lower-upper limits}. This method uses a
     * helper method <span style="color: #6198d4;">{@code notPrimeUpToNList()}</span>
     * for finding prime numbers within the range.
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code ArrayList<>()}</span>
     * function for handling list related issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void primeNumberInRange(){

        System.out.printf("Prime numbers from %d to %d are: (List<>)\n",
                lowerLimit, upperLimit);
        List<Integer> result = notPrimeUpToNList();

        for (int i = lowerLimit; i <= upperLimit; i++ ){
            if ( !result.contains(i)){
                System.out.printf("%d, ", i);
            }
        } System.out.println("- are prime numbers.");
    }
}
