public class Array1D {

    static int[] items = {1, 2, 3, 4, 3, 4, 5};

    static int[][] items2D =
                    {{7, 2, 3, 4, 3, 4, 5},
                    {6, 3, 4, 4, 5, 1, 2},
                    {5, 6, 3, 7, 5, 8, 3}};

    static int noOfItems(){
        return items.length;
    }

    static int itemsSum(){
        int sum = 0;
        int i = 0;
        while (i< items.length){
            sum += items[i];
            i++;
        }
        return sum;
    }

    static float itemsAvg(){
        return (float) itemsSum() / items.length;
    }

    static int numberOfOccurrence(int numToMatch){
        int occurrence = 0;
        int i = 0;
        while (i < items.length){
            if (items[i] == numToMatch){
                occurrence++;

            } i++;
        }
        return occurrence;
    }


    static int noOfItems2D(){
        int itemCount = 0;
        int i = 0;
        while (i < items2D.length) {
            int j = 0;
            while (j < items2D[i].length) {
                itemCount++;
                j++;
            }
            i++;
        }
        return itemCount;
    }

    static int itemsSum2D(){
        int sum = 0;
        int i = 0;
        while (i < items2D.length){
            int j=0;
            while (j < items2D[i].length) {
                sum += items2D[i][j];
                j++;
            }i++;
        }return sum;
    }

    static float itemsAvg2D(){
        int i = 0;
        return (float) itemsSum2D() / (items2D.length * items2D[i].length);
    }

    static int numberOfOccurrence2D(int numToMatch) {
        int occurrence = 0;
        int i = 0;int k=0;
            while (i < 3) {
                int j = 0;
                while (j < 7) {
                    if (items2D[i][j] == numToMatch) {
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
        System.out.printf("No of row: %d, No of Columns: %d, digit at [2][6] is: %d\n",
                items2D.length,
                items2D[i].length,
                items2D[2][6]);
    }

}
