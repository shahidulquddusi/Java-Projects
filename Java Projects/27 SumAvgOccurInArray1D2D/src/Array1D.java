public class Array1D {

    static int[] numbers = {1, 2, 3, 4, 3, 4, 5};

    static int noOfNumbers(){
        return numbers.length;
    }

    static int numbersSum(){
        int sum = 0;
        int i = 0;
        while (i< numbers.length){
            sum += numbers[i];
            i++;
        }
        return sum;
    }

    static float numbersAvg(){
        return (float) numbersSum() / numbers.length;
    }

    static int numberOfOccurrence(int numToMatch){
        int occurrence = 0;
        int i = 0;
        while (i < numbers.length){
            if (numbers[i] == numToMatch){
                occurrence++;

            } i++;
        }
        return occurrence;
    }


}
