public class Main {
    public static void main(String[] args) {

        // Press 'Run'
        System.out.println("-- Array 1D --");
        System.out.printf("1D Arr - No. of Numbers: %d\n", Array1D.noOfNumbers());
        System.out.printf("1D Arr - Sum of Numbers: %d\n", Array1D.numbersSum());
        System.out.printf("1D Arr - Avg of Numbers: %.2f\n", Array1D.numbersAvg());
        System.out.printf("1D Arr - 3 is in Numbers: %d times\n",
                Array1D.numberOfOccurrence(3));

        System.out.println("\n-- Array 2D --");
        System.out.printf("2D Arr - No. of Numbers: %d\n", Array2D.noOfNumbers2D());
        System.out.printf("2D Arr - Sum of Numbers: %d\n", Array2D.numbersSum2D());
        System.out.printf("2D Arr - Sum of Numbers in Row 3: %d\n", Array2D.numbersSumRowThree2D());
        System.out.printf("2D Arr - Sum of Numbers in Column 2: %d\n", Array2D.numbersSumColTwo2D());
        System.out.printf("2D Arr - Avg of Numbers: %.2f\n", Array2D.numbersAvg2D());
        System.out.printf("2D Arr - 5 is in Numbers: %d times\n",
                Array2D.numberOfOccurrence2D(5));
        Array2D.noOfRowCol2DArr();

        /* -- Output Sample --
        -- Array 1D --
        1D Arr - No. of Numbers: 7
        1D Arr - Sum of Numbers: 22
        1D Arr - Avg of Numbers: 3.14
        1D Arr - 3 is in Numbers: 2 times

        -- Array 2D --
        2D Arr - No. of Numbers: 21
        2D Arr - Sum of Numbers: 90
        2D Arr - Avg of Numbers: 4.29
        2D Arr - 5 is in Numbers: 4 times
        No of row: 3, No of Columns: 7, Number at [2][6] is: 3
        */
    }
}