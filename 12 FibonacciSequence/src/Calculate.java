public class Calculate {

    static int number = Input.inputNumber("a");

    /**
     * A simple method that calculates the {@code Fibonacci sequence}
     * up to the {@code +n}</span> number.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code loop}</span>
     * for handling {@code iteration} issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // 0 1 1 2 3 5 8 13 21 34
    static void fibonacciSeqWhileLoop() {

        System.out.printf("Fibonacci sequence up to %d is: \n", number);

        // way 1: while prevNum = 1 & i = 0
        System.out.print("while loop (prevN=1; i=0): \t");
        int prevNum = 1;
        int i = 0;
        while (i <= number) {
            System.out.printf("%d, ", i);
            i = i + prevNum;
            prevNum = i - prevNum;
        }
        System.out.println();
    }

    /**
     * A simple method that calculates the {@code Fibonacci sequence}
     * up to the {@code +n}</span> number.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code loop}</span>
     * for handling {@code iteration} issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // way 2: while prevNum = 0 & i = 1
    static void fibonacciSeqWhileLoop2() {
        System.out.print("while loop (prevN=0; i=1): \t");
        int prevNum = 0;
        int i = 1;
        while (i <= number) {
            System.out.printf("%d, ", i);
            i = i + prevNum;
            prevNum = i - prevNum;
        }
        System.out.println();
    }

    /**
     * A simple method that calculates the {@code Fibonacci sequence}
     * up to the {@code +n}</span> number.
     *
     * <br><br> The method takes {@code user input} and
     * validates the inputs with recursive request. It also
     * uses <span style="color: #6198d4;">{@code loop}</span>
     * for handling {@code iteration} issues.
     * <br>
     * @return <span style="color: #6198d4;">{@code void}</span>
     */
    // for loop: prevNum = -1 & i = 0
    static void fibonacciSeqForLoop() {
        System.out.print("for loop (prevN=-1; i=0): \t");
        int i, prevNum;
        prevNum = -1;
        for (i = 0; i <= number; i = i + prevNum) {
            System.out.printf("%d, ", i);
            prevNum = i - prevNum;
        }
        System.out.println();
    }
}
