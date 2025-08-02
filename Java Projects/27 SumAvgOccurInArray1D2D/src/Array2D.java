public class Array2D {
    static int[][] numbers2D =
                    {{7, 2, 3, 4, 3, 4, 5},
                    {6, 3, 4, 4, 5, 1, 2},
                    {5, 6, 3, 7, 5, 8, 3}};

    static int noOfNumbers2D(){
        int itemCount = 0;
        int i = 0;
        while (i < numbers2D.length) {
            int j = 0;
            while (j < numbers2D[i].length) {
                itemCount++;
                j++;
            }
            i++;
        }
        return itemCount;
    }

    static int numbersSum2D(){
        int sum = 0;
        int i = 0;
        while (i < numbers2D.length){
            int j=0;
            while (j < numbers2D[i].length) {
                sum += numbers2D[i][j];
                j++;
            }i++;
        }return sum;
    }

    static int numbersSumRowThree2D(){
        int rowIndex = 2;
        int sum = 0;
//        int i = 0;
//        while (i == 1){
            int j=0;
            while (j < numbers2D[rowIndex].length) {
                sum += numbers2D[rowIndex][j];
                j++;
//            };//i++
        }return sum;
    }

    static int numbersSumColTwo2D() {
        int colIndex = 1;
        int sum = 0;
        int i = 0;
        while (i < numbers2D.length) {
            sum += numbers2D[i][colIndex];
            i++;
        }
        return sum;
    }

    static float numbersAvg2D(){
        int i = 0;
        return (float) numbersSum2D() / (numbers2D.length * numbers2D[i].length);
    }

    static int numberOfOccurrence2D(int numToMatch) {
        int occurrence = 0;
        int i = 0;int k=0;
            while (i < 3) {
                int j = 0;
                while (j < 7) {
                    if (numbers2D[i][j] == numToMatch) {
                        k++;
                        occurrence = k;
                    }
                    j++;
                }
                i++;
            }
        return occurrence;
    }

    static void noOfRowCol2DArr(){
        int i=0, j=0;
        System.out.printf("No of row: %d, No of Columns: %d, Number at [2][6] is: %d\n",
                numbers2D.length,
                numbers2D[i].length,
                numbers2D[2][6]);
    }
}
