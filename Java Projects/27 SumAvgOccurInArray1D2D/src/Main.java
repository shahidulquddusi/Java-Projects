public class Main {
    public static void main(String[] args) {

        System.out.println("-- Array 1D --");
        System.out.printf("1D Arr - No. of Items: %d\n", Array1D.noOfItems());
        System.out.printf("1D Arr - Sum of Items: %d\n", Array1D.itemsSum());
        System.out.printf("1D Arr - Avg of Items: %.2f\n", Array1D.itemsAvg());
        System.out.printf("1D Arr - 3 is in Items: %d times\n",
                Array1D.numberOfOccurrence(3));

        System.out.println("\n-- Array 2D --");
        System.out.printf("2D Arr - No. of Items: %d\n", Array1D.noOfItems2D());
        System.out.printf("2D Arr - Sum of Items: %d\n", Array1D.itemsSum2D());
        System.out.printf("2D Arr - Avg of Items: %.2f\n", Array1D.itemsAvg2D());
        System.out.printf("2D Arr - 5 is in Items: %d times\n",
                Array1D.numberOfOccurrence2D(5));
        Array1D.noOfRowCol2DArr();

        /* -- Output Sample --
        -- Array 1D --
        1D Arr - No. of Items: 7
        1D Arr - Sum of Items: 22
        1D Arr - Avg of Items: 3.14
        1D Arr - 3 is in Items: 2 times

        -- Array 2D --
        2D Arr - No. of Items: 21
        2D Arr - Sum of Items: 90
        2D Arr - Avg of Items: 4.29
        2D Arr - 5 is in Items: 4 times
        No of row: 3, No of Columns: 7, digit at [2][6] is: 3
        */
    }
}