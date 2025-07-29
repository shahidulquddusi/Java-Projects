import java.util.ArrayList;
import java.util.List;

public class Calculate {

    static int numberInput = Input.inputNumber("a");

    /**
     * A <span style="color: #6198d4;">{@code helper}</span>
     * method for finding whether a number is a
     * <span style="color: #6198d4;">{@code prime number}</span>
     * or not. It internally determines a
     * {@code 'non'-prime number} with {@code no visible output}.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request.
     *
     * <br>
     * @return <span style="color: #6198d4;">{@code boolean}</span>
     * with blank output
     */
    static boolean isNotPrimeNumber() {

        int number = numberInput;
        for (int i = 2; i < number; i = i + 1) {
            if (number % i == 0) {
                return true; // is 'not' a prime number
            }
        }
        return false; // is a prime number
    }

    /**
     * A simple method that determines whether a number is a
     * <span style="color: #6198d4;">{@code prime number}</span>
     * or not. This method uses a helper method
     * <span style="color: #6198d4;">{@code isNotPrimeNumber()}</span>
     * for validating a prime number.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void isPrimeNumber() {

        int number = numberInput;
        if (isNotPrimeNumber()) {
            System.out.printf("%d is not a prime number. (void - a)\n", number);
        } else System.out.printf("%d is a prime number. (void - a)\n", number);
    }

    // --TODO-- could not add 'is a prime number' successfully
    /**
     * A simple method that determines whether a number is a
     * <span style="color: #6198d4;">{@code 'non' prime number}</span>.
     * <span style="color: #FF7276;">It fails to output
     * a </span><span style="color: #FF7276;">{@code prime number}</span>
     * but successfully outputs a {@code 'non' prime number}.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void notPrimeNumberOnly() {
        int number = numberInput;
        for (int i = 2; i < number; i = i + 1) {
            if (number % i == 0) {
                System.out.printf("%d is not a prime number. (void - b - only 'non' prime)\n", number);
                break;
            }
        }
    }

    /**
     * A <span style="color: #6198d4;">{@code helper}</span> method
     * for finding the {@code list} of
     * <span style="color: #6198d4;">{@code prime number}</span> within a
     * range of {@code 1-n}. It internally determines the list of
     * {@code 'non'-prime number} within the range of {@code 1-n}
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

        int number = numberInput;
        List<Integer> notPrimeList = new ArrayList<>();

        for (int i = 2; i <= number; i = i + 1) {
            for (int r = 2; r < i; r = r + 1) {
                if (i % r == 0) {
                    notPrimeList.add(i);
                    break;
                }
            }
        } return notPrimeList; //return false; //
    }

    /**
     * A simple method that finds the {@code list} of
     * <span style="color: #6198d4;">{@code prime number}</span> within
     * the range of {@code 1-n}. This method uses a
     * helper method <span style="color: #6198d4;">{@code notPrimeUpToNList()}</span>
     * for finding prime numbers.
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code ArrayList<>()}</span>
     * function for handling list related issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void primeNumUpToN(){

        int number = numberInput;
        System.out.printf("Prime numbers up to %d are: (List<>)\n", number);
        List<Integer> result = notPrimeUpToNList();

        for (int i = 1; i <= number; i++ ){
            if ( !result.contains(i)){
                System.out.printf("%d, ", i);
            }
        } System.out.println("Prime numbers.");
    }

    /**
     * A simple method that finds all
     * <span style="color: #6198d4;">{@code 'non' prime numbers}</span> within
     * the range of {@code 1-n}.
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    static void notPrimeUpToNVoid() {

        int number = numberInput;
        int r;
        for (int i = 2; i < number; i = i + 1) {
                for (r = 2; r < i; r = r + 1) {
                    if (i % r == 0) {
                        System.out.printf("%d, ", i);
                        break;
                    }
                }
        } System.out.println("are non-prime numbers. (void)");
    }

}
