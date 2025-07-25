import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please input n-th number: ");
        int nThNumber = input.nextInt();

        // Grand Total: Raw formula
        double sumOfOdd = Math.pow( Math.ceilDiv( nThNumber , 2 ), 2);
        System.out.printf("Sum of odd up to %d is: %1.0f\n",
                nThNumber, sumOfOdd);

        // Grand Total: Arithmetic Progression (AP) formula:
        double sumOfOddArSeq = (double) (1 + nThNumber)/2 * Math.ceilDiv(nThNumber,2);
        System.out.printf("Using AP formula sum is: %1.0f\n",sumOfOddArSeq);

        System.out.println("\nIllustration is below:");

        // Totals: Raw formula (illustration)
        int i = 1;
        while(i<=nThNumber){
            double sumOfOddLoop = Math.pow( Math.ceilDiv( i , 2 ), 2);
            System.out.printf("Sum of odd up to %d:   \t%1.0f\n",
                    i, sumOfOddLoop);
            i += 2;
        }

        /*       --Output Sample--
        Please input n-th number: 118
        Sum of odd up to 118 is: 3481

        Illustration is below:
        Sum of odd up to 1:   	1
        Sum of odd up to 3:   	4
        Sum of odd up to 5:   	9
        Sum of odd up to 7:   	16
        ... ...
        Sum of odd up to 113:   	3249
        Sum of odd up to 115:   	3364
        Sum of odd up to 117:   	3481

                --Test-2: Large number--
        Please input n-th number: 104457
        Sum of odd up to 104457 is: 2727868441

        Illustration is below:
        ... ...
        Sum of odd up to 104453:   	2727659529
        Sum of odd up to 104455:   	2727763984
        Sum of odd up to 104457:   	2727868441
        */
    }
}